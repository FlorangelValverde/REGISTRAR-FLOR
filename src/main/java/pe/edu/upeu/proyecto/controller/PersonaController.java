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

@RestController
@CrossOrigin (origins = "*", allowedHeaders = "*")
@RequestMapping ("/personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return personaService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		try {
			return personaService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
		return null;
	}
	@PostMapping ("/add")
	public int create(@RequestBody Persona c) {
		System.out.println("Crear: "+c.getNombre() + " " +c.getApe_pat() + " "+c.getApe_mat());
		return personaService.create(c);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return personaService.delete(id);
	}
	@PutMapping("/edit/{id}")
	public int update(@RequestBody Persona c, @PathVariable int id_pers) {
		System.out.println(c.getNombre());
		System.out.println(c.getApe_pat());
		System.out.println(c.getApe_mat());
		Persona persona = new Persona();
		persona.setId_pers(id_pers);;
		persona.setNombre(c.getNombre());
		persona.setApe_pat(c.getApe_pat());
		persona.setApe_mat(c.getApe_mat());
		return personaService.update(c);
	}

}
