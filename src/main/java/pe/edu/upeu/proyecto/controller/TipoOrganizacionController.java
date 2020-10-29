package pe.edu.upeu.proyecto.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.service.TipoOrganizacionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipo")
public class TipoOrganizacionController {
	
	@Autowired
	private TipoOrganizacionService tos;
	
	@GetMapping("/")
	public List<Map<String, Object>> get() {
		return tos.readAll();
	}
}
