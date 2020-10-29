package pe.edu.upeu.proyecto.dao;

import java.util.List;
import java.util.Map;

public interface TipoOrganizacionDao {
	
	/*int create(TipoOrganizacion to);*/
	List<Map<String, Object>> readAll();
}
