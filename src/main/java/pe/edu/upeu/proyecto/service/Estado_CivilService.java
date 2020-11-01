package pe.edu.upeu.proyecto.service;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Estado_Civil;

public interface Estado_CivilService {

	int create (Estado_Civil civil);
	int update (Estado_Civil estado);
	int delete (int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
