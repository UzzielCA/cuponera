package uzziel.cervantes.demo.model.dto;

public class UsuarioDto {

	public UsuarioDto(String nombre, String apellido, String correo, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
	}

	private String nombre;
	
	private String apellido;
	
	private String correo;
	
	private String password;
	
	
	private UsuarioDto referencia;

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

	public UsuarioDto getReferencia() {
		return referencia;
	}

	public void setReferencia(UsuarioDto referencia) {
		this.referencia = referencia;
	}
	
}
