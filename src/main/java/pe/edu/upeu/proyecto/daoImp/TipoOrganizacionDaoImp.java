package pe.edu.upeu.proyecto.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.proyecto.dao.TipoOrganizacionDao;
import pe.edu.upeu.proyecto.entity.TipoOrganizacion;

@Repository
public class TipoOrganizacionDaoImp implements TipoOrganizacionDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from Tipo_Organizacion";
		return jdbcTemplate.queryForList(SQL);
	}
}
