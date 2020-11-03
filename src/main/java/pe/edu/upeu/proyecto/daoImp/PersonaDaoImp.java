package pe.edu.upeu.proyecto.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import pe.edu.upeu.proyecto.dao.PersonaDao;
import pe.edu.upeu.proyecto.entity.Persona;

@Component
public class PersonaDaoImp implements PersonaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Persona persona) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.PR_INS_PERSONA(?,?,?,?,?,?,?,?,?)", persona.getNombre(), 
									persona.getApellidos(), persona.getDni(), persona.getFec_nacimiento(), persona.getCelular(),
									persona.getCorreo(), persona.getUsuario(), persona.getClave(), persona.getIdestado_civil());
	}

	@Override
	public int update(Persona persona) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.PR_UPD_PERSONA(?,?,?,?,?,?,?,?,?,?)", persona.getIdpersona(), persona.getNombre(), 
				persona.getApellidos(), persona.getDni(), persona.getFec_nacimiento(), persona.getCelular(),
				persona.getCorreo(), persona.getUsuario(), persona.getClave(), persona.getIdestado_civil());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_PERSONA.PR_DEL_PERSONA(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
