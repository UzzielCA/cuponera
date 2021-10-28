package uzziel.cervantes.demo.model.dto;

public class UsuarioAltaDto {
	
	private String nombre;
	
	private String apellido;
	
	private String correo;
	
	private String password;
	
	private int referencia;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}
	
	
}
