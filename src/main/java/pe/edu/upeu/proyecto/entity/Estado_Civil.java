/*Creado por Diego Alor Chavarria*/
package pe.edu.upeu.proyecto.entity;

public class Estado_Civil {
	
	private int idestado_civil;
	private String nombre;
	
	public Estado_Civil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estado_Civil(int idestado_civil, String nombre) {
		super();
		this.idestado_civil = idestado_civil;
		this.nombre = nombre;
	}

	public int getIdestado_civil() {
		return idestado_civil;
	}

	public void setIdestado_civil(int idestado_civil) {
		this.idestado_civil = idestado_civil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
