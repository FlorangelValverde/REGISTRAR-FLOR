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
import pe.edu.upeu.proyecto.entity.Usuario;
import pe.edu.upeu.proyecto.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping ("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public Map<String, Object>readAll(){
		return usuarioService.readAll();
	}
	public Map<String, Object> get(){
		return usuarioService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id){
		return usuarioService.read(id);
	}
	@PostMapping ("/add")
	public int create(@RequestBody Usuario c) {
		return usuarioService.create(c);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return usuarioService.delete(id);
	}
	@PutMapping("/edit/{id}")
	public int update(@RequestBody Usuario c, @PathVariable int id) {
		c.setId_usua(id);
		return usuarioService.update(c);
	}
	
}
