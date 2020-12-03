 package pe.edu.upeu.proyecto.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.proyecto.entity.Tipo_Asociacion;
import pe.edu.upeu.proyecto.service.Tipo_AsociacionService;
@RestController
@CrossOrigin(origins = "*", allowedHeaders= "*")
@RequestMapping("/tipoasociaciones")
public class Tipo_AsociacionController {

	@Autowired
	private Tipo_AsociacionService tipo_asociacionService;
	
	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object> realAll() {
		return tipo_asociacionService.readAll();
	}
	public Map<String, Object> get(){
		return tipo_asociacionService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return tipo_asociacionService.read(id);
	}
	@PostMapping("/add")
	//este metodo permite registrar una competencia
	public int create(@RequestBody Tipo_Asociacion c) {
		return tipo_asociacionService.create(c);		
	}
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar una competencia
	public int delete(@PathVariable int id) {
		return tipo_asociacionService.delete(id);
	}	
	
	@PutMapping("/edit/{id}")
	//este metodo permite modifi/edit/{id}car una competencia
    public int update(@RequestBody Tipo_Asociacion c,@PathVariable int id) {
		c.setIdtipo_asociacion(id);
		
	return tipo_asociacionService.update(c);
	}	
	
}


