package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.Tipo_AsociacionDao;
import pe.edu.upeu.proyecto.entity.Tipo_Asociacion;
import pe.edu.upeu.proyecto.service.Tipo_AsociacionService;
@Service
public class Tipo_AsociacionServiceImpl implements Tipo_AsociacionService {
@Autowired
	private Tipo_AsociacionDao tipo_asociacionDao;

	@Override
	public int create(Tipo_Asociacion d) {
		// TODO Auto-generated method stub
		return tipo_asociacionDao.create(d);
	}

	@Override
	public int update(Tipo_Asociacion d) {
		// TODO Auto-generated method stub
		return tipo_asociacionDao.update(d);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_asociacionDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipo_asociacionDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipo_asociacionDao.readAll();
	}

}
