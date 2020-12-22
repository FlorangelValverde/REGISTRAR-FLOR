package pe.edu.upeu.proyecto.daoImp;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.PersonaDao;
import pe.edu.upeu.proyecto.entity.Persona;

@Repository
public class PersonaDaoImpl implements PersonaDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall; 
	@Override
	public int create(Persona p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.INS(?,?,?,?,?,?,?,?,?,?)",p.getApe_mat(), p.getApe_pat(), p.getNombre(), p.getDni(), p.getCorreo(),p.getTelefono(),p.getF_nac(),p.getEstado(),p.getUbicacion());
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.UPD(?,?,?,?,?,?,?,?,?,?,?)", p.getApe_mat(), p.getApe_pat(), p.getNombre(), p.getDni(), p.getCorreo(),p.getTelefono(),p.getF_nac(),p.getEstado(),p.getUbicacion(),p.getId_pers());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.DEL(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall (jdbcTemplate)
				.withCatalogName("PKG_PERSONA")
				.withProcedureName("sp_read_persona")
				.declareParameters(new SqlOutParameter("cursor_persona", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlOutParameter("ID_PERS", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("ID_PERS", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public List <Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		List <Map<String, Object>> flor = new ArrayList<>();
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_PERSONA")
				.withProcedureName("sp_listar_persona")
				.declareParameters(new SqlOutParameter ("cursor_persona", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		Map<String, Object> lista =  simpleJdbcCall.execute();
		flor.add(lista);
		return  flor;
	}

}
