/*Creado por Diego Alor Chavarria*/
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

import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.service.PersonaService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/all")
	/*public Map<String, Object> realAll() {
		return personaService.readAll();
	}*/
	public Map<String, Object> get(){
		return personaService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return personaService.read(id);
	}
	@PostMapping("/add")
	//este metodo permite registrar una competencia
	public int create(@RequestBody Persona c) {
		return personaService.create(c);		
	}
	@DeleteMapping("/delete/{id}")
	//este metodo permite eliminar una competencia
	public int delete(@PathVariable int id) {
		return personaService.delete(id);
	}	
	
	@PutMapping("/edit/{id}")
	//este metodo permite modificar una competencia
    public int update(@RequestBody Persona c,@PathVariable int id) {
		c.setIdpersona(id);
		
	return personaService.update(c);
	}	
	
}
