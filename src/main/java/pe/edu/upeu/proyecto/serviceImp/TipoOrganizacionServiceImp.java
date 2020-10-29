package pe.edu.upeu.proyecto.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.proyecto.dao.TipoOrganizacionDao;
import pe.edu.upeu.proyecto.service.TipoOrganizacionService;

@Service
public class TipoOrganizacionServiceImp implements TipoOrganizacionService {

	@Autowired
	private TipoOrganizacionDao tod;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return tod.readAll();
	}
}
