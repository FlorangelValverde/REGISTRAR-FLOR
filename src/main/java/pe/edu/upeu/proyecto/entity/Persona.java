package pe.edu.upeu.proyecto.entity;

public class Persona {
	@Override
	public String toString() {
		return "Persona [id_pers=" + id_pers + ", nombre=" + nombre + ", ape_pat=" + ape_pat + ", ape_mat=" + ape_mat
				+ ", dni=" + dni + ", correo=" + correo + ", telefono=" + telefono + ", f_nac=" + f_nac + ", estado="
				+ estado + ", ubicacion=" + ubicacion + "]";
	}
	private int id_pers;
	private String nombre;
	private String ape_pat;
	private String ape_mat;
	private String dni;
	private String correo;
	private int telefono;
	private String f_nac;
	private String estado;
	private String ubicacion;
	public Persona () {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona (int id_pers, String nombre, String ape_pat, String ape_mat, String dni, String correo, int telefono,
			String f_nac, String estado, String ubicacion) {
		super();
		this.id_pers = id_pers;
		this.nombre = nombre;
		this.ape_pat = ape_pat;
		this.ape_mat = ape_mat;
		this.dni = dni;
		this.correo = correo;
		this.telefono = telefono;
		this.f_nac = f_nac;
		this.estado = estado;
		this.ubicacion = ubicacion;
	}
	public int getId_pers() {
		return id_pers;
	}
	public void setId_pers(int id_pers) {
		this.id_pers = id_pers;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe_pat() {
		return ape_pat;
	}
	public void setApe_pat(String ape_pat) {
		this.ape_pat = ape_pat;
	}
	public String getApe_mat() {
		return ape_mat;
	}
	public void setApe_mat(String ape_mat) {
		this.ape_mat = ape_mat;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getF_nac() {
		return f_nac;
	}
	public void setF_nac(String f_nac) {
		this.f_nac = f_nac;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}
