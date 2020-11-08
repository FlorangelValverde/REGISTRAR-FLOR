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
import org.springframework.stereotype.Repository;

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.proyecto.dao.Tipo_AsociacionDao;
import pe.edu.upeu.proyecto.entity.Tipo_Asociacion;


@Repository
public class Tipo_AsociacionDaoImpl implements Tipo_AsociacionDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
		@Override
		public int create(Tipo_Asociacion d) {
			// TODO Auto-generated method stub
			return jdbcTemplate.update("call PKG_TIPO_ASOCIACION.PR_INS_TIPO_ASOCIACION(?)", d.getNombre());
		}

		@Override
		public int update(Tipo_Asociacion d) {
			// TODO Auto-generated method stub
			return jdbcTemplate.update("call PKG_TIPO_ASOCIACION.PR_UPD_TIPO_ASOCIACION(?,?)", d.getIdtipo_asociacion(),d.getNombre());
		}

		@Override
		public int delete(int id) {
			// TODO Auto-generated method stub
			return jdbcTemplate.update("call PKG_TIPO_ASOCIACION.PR_DEL_TIPO_ASOCIACION(?)", id);
		}

		@Override
		public Map<String, Object> read(int id) {
			// TODO Auto-generated method stub
			System.out.println(id);
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
					.withCatalogName("PKG_TIPO_ASOCIACION")
					.withProcedureName("PR_BUS_TIPO_ASOCIACION")
					.declareParameters(new SqlOutParameter("CUR_TIPO_ASOCIACION", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("IDTIPO_ASOCIACION", Types.INTEGER));
					SqlParameterSource in = new MapSqlParameterSource().addValue("IDTIPO_ASOCIACION", id);
					return simpleJdbcCall.execute(in);
		}

		@Override
		public Map<String, Object> readAll() {
			// TODO Auto-generated method stub
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
					.withCatalogName("PKG_TIPO_ASOCIACION") //nombre del paquete
					.withProcedureName("PR_LIS_TIPO_ASOCIACION") //nombre del procedimiento
					.declareParameters(new SqlOutParameter("CUR_TIPO_ASOCIACION", OracleTypes.CURSOR, new ColumnMapRowMapper()));
					return simpleJdbcCall.execute();
		}

	}

