package pe.edu.upeu.proyecto.service;


import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;

public interface UsuarioService {
	int create (Persona persona, Usuario usuario);
}
