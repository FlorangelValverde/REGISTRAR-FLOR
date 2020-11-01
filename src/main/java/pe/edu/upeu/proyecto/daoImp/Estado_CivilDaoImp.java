package pe.edu.upeu.proyecto.daoImp;

import java.util.Map;

import org.springframework.stereotype.Repository;

import pe.edu.upeu.proyecto.dao.Estado_CivilDao;
import pe.edu.upeu.proyecto.entity.Estado_Civil;

@Repository
public class Estado_CivilDaoImp implements Estado_CivilDao{

	@Override
	public int create(Estado_Civil civil) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Estado_Civil estado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
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
