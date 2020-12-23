package pe.edu.upeu.proyecto.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;
import pe.edu.upeu.proyecto.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping ("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping ("/add")
	public int create(@RequestBody String Jungkook) {
		Gson gson = new Gson();
		Persona persona = gson.fromJson(Jungkook, Persona.class);
		Usuario usuario = gson.fromJson(Jungkook, Usuario.class);
		return usuarioService.create(persona, usuario);
	}
	
	@GetMapping("/listar")
    public List<Map<String, Object>> listar(){
        return usuarioService.listar();
    }
	
	
}
