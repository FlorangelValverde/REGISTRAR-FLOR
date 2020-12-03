package pe.edu.upeu.proyecto.dao;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Persona;

public interface PersonaDao {
	int create (Persona p);
	int update (Persona p);
	int delete (int id);
	Map<String, Object> read (int id);
	Map<String, Object> readAll();

}
