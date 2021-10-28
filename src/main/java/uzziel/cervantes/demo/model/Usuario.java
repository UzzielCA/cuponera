package uzziel.cervantes.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name = "id")
	private int idUsuario;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "password")
	private String password;

	@Column(name = "usuario_referenciado")
	private Integer usuarioReferenciado;
	
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(
		name = "usuario_cupon",
		joinColumns = { @JoinColumn(name = "id_usuario")},
		inverseJoinColumns = { @JoinColumn(name = "id_cupon")}
	)
	private Set<Cupon> cupones = new HashSet<>();

	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String nombre, String apellido, String correo, String password,
			Integer usuarioReferenciado) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.password = password;
		this.usuarioReferenciado = usuarioReferenciado;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

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

	public Integer getUsuarioReferenciado() {
		return usuarioReferenciado;
	}

	public void setUsuarioReferenciado(Integer usuarioReferenciado) {
		this.usuarioReferenciado = usuarioReferenciado;
	}
	
	public Set<Cupon> getCupones() {
		return cupones;
	}

	public void setCupones(Set<Cupon> cupones) {
		this.cupones = cupones;
	}
}
