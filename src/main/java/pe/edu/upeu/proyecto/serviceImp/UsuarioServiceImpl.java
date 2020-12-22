package pe.edu.upeu.proyecto.serviceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.UsuarioDao;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;
import pe.edu.upeu.proyecto.service.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
@Autowired
private UsuarioDao usuarioDao;

@Override
public int create(Persona persona, Usuario usuario) {
	// TODO Auto-generated method stub
	return usuarioDao.create(persona, usuario);
}
	
}
