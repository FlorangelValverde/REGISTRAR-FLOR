package pe.edu.upeu.proyecto.entity;

public class Usuario {
	private int id_usua;
	private String password;
	private String estado;
	private String username;
	public Usuario() {
		super();
	}
	public Usuario(int id_usua, String password, String estado, String username) {
		super();
		this.id_usua = id_usua;
		this.password = password;
		this.estado = estado;
		this.username = username;
	}
	
	public int getId_usua() {
		return id_usua;
	}
	public void setId_usua(int id_usua) {
		this.id_usua = id_usua;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
