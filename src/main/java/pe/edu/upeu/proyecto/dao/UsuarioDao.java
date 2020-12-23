package pe.edu.upeu.proyecto.dao;



import java.util.List;
import java.util.Map;

import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;

public interface UsuarioDao {
	int create (Persona persona, Usuario usuario);
	List<Map<String, Object>> listar();
}
