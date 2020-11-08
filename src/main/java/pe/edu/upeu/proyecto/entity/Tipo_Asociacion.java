package pe.edu.upeu.proyecto.entity;

public class Tipo_Asociacion {
	private int idtipo_asociacion;
	private String nombre;
	public Tipo_Asociacion() {
		
	}
	public int getIdtipo_asociacion() {
		return idtipo_asociacion;
	}
	public void setIdtipo_asociacion(int idtipo_asociacion) {
		this.idtipo_asociacion = idtipo_asociacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tipo_Asociacion(int idtipo_asociacion, String nombre) {
		super();
		this.idtipo_asociacion = idtipo_asociacion;
		this.nombre = nombre;
	}
	
}

