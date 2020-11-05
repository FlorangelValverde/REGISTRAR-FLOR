/*Creado por Diego Alor Chavarria*/
package pe.edu.upeu.proyecto.entity;

import java.util.Date;

public class Persona {
	
	private int idpersona;
	private String nombre;
	private String apellidos;
	private int dni;
	private Date fec_nacimiento;
	private String celular;	
	private String correo;
	private String usuario;
	private String clave;
	private int idestado_civil;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(int idpersona, String nombre, String apellidos, int dni, Date fec_nacimiento, String celular,
			String correo, String usuario, String clave, int idestado_civil) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fec_nacimiento = fec_nacimiento;
		this.celular = celular;
		this.correo = correo;
		this.usuario = usuario;
		this.clave = clave;
		this.idestado_civil = idestado_civil;
	}

	public int getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFec_nacimiento() {
		return fec_nacimiento;
	}

	public void setFec_nacimiento(Date fec_nacimiento) {
		this.fec_nacimiento = fec_nacimiento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getIdestado_civil() {
		return idestado_civil;
	}

	public void setIdestado_civil(int idestado_civil) {
		this.idestado_civil = idestado_civil;
	}
	
}
