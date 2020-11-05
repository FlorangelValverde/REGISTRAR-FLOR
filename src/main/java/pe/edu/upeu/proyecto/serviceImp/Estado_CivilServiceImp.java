/*Creado por Diego Alor Chavarria*/
package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Estado_CivilDao;
import pe.edu.upeu.proyecto.entity.Estado_Civil;
import pe.edu.upeu.proyecto.service.Estado_CivilService;

@Service
public class Estado_CivilServiceImp implements Estado_CivilService{

	@Autowired
	private Estado_CivilDao estadocivil;
	
	@Override
	public int create(Estado_Civil civil) {
		// TODO Auto-generated method stub
		return estadocivil.create(civil);
	}

	@Override
	public int update(Estado_Civil estado) {
		// TODO Auto-generated method stub
		return estadocivil.update(estado);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return estadocivil.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return estadocivil.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return estadocivil.readAll();
	}

}
