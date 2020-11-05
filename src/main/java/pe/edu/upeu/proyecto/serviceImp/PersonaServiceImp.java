/*Creado por Diego Alor Chavarria*/
package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.PersonaDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {

	@Autowired
	private PersonaDao personadao;
	
	@Override
	public int create(Persona persona) {
		// TODO Auto-generated method stub
		return personadao.create(persona);
	}

	@Override
	public int update(Persona persona) {
		// TODO Auto-generated method stub
		return personadao.update(persona);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personadao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return personadao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return personadao.readAll();
	}

}
