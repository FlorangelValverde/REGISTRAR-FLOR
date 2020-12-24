package pe.edu.upeu.proyecto.daoImp;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
@Override
public int create(Persona persona, Usuario usuario) {
	// TODO Auto-generated method stub
	
	return jdbcTemplate.update("call PKG_USUARIO.INS_MATCH(?,?,?,?,?,?,?,?,?)",
			persona.getNombre(), persona.getApe_pat(), persona.getApe_mat(), persona.getDni(), persona.getCorreo(), persona.getTelefono(), persona.getF_nac(), persona.getUbicacion(), usuario.getPassword());
}
@Override
public List<Map<String, Object>> listar() {
	// TODO Auto-generated method stub
	List<Map<String,Object>> userlist = new ArrayList<>();
    simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
            .withCatalogName("PKG_USUARIO") //nombre del paquete
            .withProcedureName("LIS_USU_PERSONA") //nombre del procedimiento
            .declareParameters(new SqlOutParameter("CUR_USUARIO_PERSONA", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));
            Map<String, Object> map = simpleJdbcCall.execute();
            userlist.add(map);
    return userlist;
}
@Override
public int delete(int id_usua) {
	// TODO Auto-generated method stub
	return jdbcTemplate.update("call PKG_USUARIO.DEL_USUAPER(?)", id_usua)
			;
}
	

}
