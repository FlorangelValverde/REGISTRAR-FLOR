package pe.edu.upeu.proyecto.daoImp;

import java.sql.Types;
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
import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
@Autowired
private JdbcTemplate jdbcTemplate;
private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_USUARIO.sp_create_usu(?,?,?)", u.getUsername(),u.getEstado(), u.getPassword());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_USUARIO.sp_update_usu(?,?,?,?)", u.getId_usua(), u.getUsername(), u.getPassword(),u.getEstado());
	}

	@Override
	public int delete( int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_USUARIO.sp_delete_usu", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_USUARIO")
				.withProcedureName("sp_read_usu")
				.declareParameters(new SqlOutParameter("cursor_usuario", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlOutParameter("ID_USUA", Types.INTEGER));
				SqlParameterSource in = new MapSqlParameterSource().addValue("ID_USUA",id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_USUARIO")
				.withProcedureName("sp_listar_usu")
				.declareParameters(new SqlOutParameter ("cursor_usuario", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

}
