package pe.edu.upeu.proyecto.daoImp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;


import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
@Autowired
private JdbcTemplate jdbcTemplate;
@Override
public int create(Persona persona, Usuario usuario) {
	// TODO Auto-generated method stub
	
	return jdbcTemplate.update("call PKG_USUARIO.INS_MATCH(?,?,?,?,?,?,?,?,?)",
			persona.getNombre(), persona.getApe_pat(), persona.getApe_mat(), persona.getDni(), persona.getCorreo(), persona.getTelefono(), persona.getF_nac(), persona.getUbicacion(), usuario.getPassword());
}
	

}
