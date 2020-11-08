package pe.edu.upeu.proyecto.service;

import java.util.Map;

import pe.edu.upeu.proyecto.entity.Tipo_Asociacion;

public interface Tipo_AsociacionService {
	int create (Tipo_Asociacion d);
	int update (Tipo_Asociacion d);
	int delete (int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
