package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Usuario;

public interface UsuarioDao {
	int create (Usuario u);
	int update (Usuario u);
	int delete (int id);
	Map<String, Object> read (int id);
	Map<String, Object> readAll();
}
