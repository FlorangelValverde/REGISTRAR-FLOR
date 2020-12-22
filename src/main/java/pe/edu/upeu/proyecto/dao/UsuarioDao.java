package pe.edu.upeu.proyecto.dao;



import pe.edu.upeu.proyecto.entity.Persona;
import pe.edu.upeu.proyecto.entity.Usuario;

public interface UsuarioDao {
	int create (Persona persona, Usuario usuario);
	
}
