 package pe.edu.upeu.proyecto.daoImp;

import java.sql.Types;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.proyecto.dao.Estado_CivilDao;
import pe.edu.upeu.proyecto.entity.Estado_Civil;

@Component 
public class Estado_CivilDaoImp implements Estado_CivilDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Estado_Civil civil) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ESTADO_CIVIL.PR_INS_ESTADO_CIVIL(?)", civil.getNombre());
	}

	@Override
	public int update(Estado_Civil estado) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ESTADO_CIVIL.PR_UPD_ESTADO_CIVIL(?,?)", estado.getIdestado_civil(), estado.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ESTADO_CIVIL.PR_DEL_ESTADO_CIVIL(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("PKG_ESTADO_CIVIL")
														 .withProcedureName("PR_READ_ESTADO_CIVIL")
														 .declareParameters(new SqlOutParameter("CUR_ESTADO_CIVIL", OracleTypes.CURSOR,
														  new ColumnMapRowMapper()), new SqlParameter("IDESTADO_CIVIL", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDESTADO_CIVIL", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		
		return null;
	}
	
}
