package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.proyecto.dao.PersonaDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.service.PersonaService;
@Service
public class PersonaServiceImpl implements PersonaService {
@Autowired
private PersonaDao personaDao;
	@Override
	public int create(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.create(p);
	}

	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}

}
