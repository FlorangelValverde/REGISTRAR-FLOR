package pe.edu.upeu.proyecto.service;


import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;

public interface UsuarioService {
	int create (Persona persona, Usuario usuario);
	List<Map<String, Object>> listar();
	int delete (int id_usua);
}
