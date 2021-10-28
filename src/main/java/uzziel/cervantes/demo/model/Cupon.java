package uzziel.cervantes.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cupon")
public class Cupon {

	@Id
	@Column(name = "id")
	private int idCupon;
	
	@Column(name = "restaurante")
	private String restaurante;
	
	@Column(name = "rfc")
	private String rfc;
	
	@Column(name = "descripcion")
	private String descripcion;
		
	@Column(name = "caducidad")
	private Date caducidad;

	public Cupon() {
		
	}
	
	public Cupon(int idCupon, String restaurante, String rfc, String descripcion, Date caducidad) {
		super();
		this.idCupon = idCupon;
		this.restaurante = restaurante;
		this.rfc = rfc;
		this.descripcion = descripcion;
		this.caducidad = caducidad;
	}


	public int getIdCupon() {
		return idCupon;
	}


	public void setIdCupon(int idCupon) {
		this.idCupon = idCupon;
	}


	public String getRestaurante() {
		return restaurante;
	}


	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Date getCaducidad() {
		return caducidad;
	}


	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}
	
}
