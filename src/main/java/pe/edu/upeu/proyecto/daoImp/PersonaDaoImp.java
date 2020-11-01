package pe.edu.upeu.proyecto.daoImp;

import java.util.Map;

import org.springframework.stereotype.Repository;

import pe.edu.upeu.proyecto.dao.PersonaDao;
import pe.edu.upeu.proyecto.entity.Persona;

@Repository
public class PersonaDaoImp implements PersonaDao {

	@Override
	public int create(Persona persona) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Persona persona) {
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
