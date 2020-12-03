package pe.edu.upeu.proyecto.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Usuario;
import pe.edu.upeu.proyecto.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
@Autowired
private UsuarioDao usuarioDao;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

}
