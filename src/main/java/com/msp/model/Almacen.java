package com.msp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Almacen {

	@Id
	private int idAlmacen;

	@Column(name="nombre", length=50)
	private String nombre;
	
	private Date fechaInagura;
	
	private Integer capacidadClientes;

	public int getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInagura() {
		return fechaInagura;
	}

	public void setFechaInagura(Date fechaInagura) {
		this.fechaInagura = fechaInagura;
	}

	public Number getCapacidadClientes() {
		return capacidadClientes;
	}

	public void setCapacidadClientes(Integer capacidadClientes) {
		this.capacidadClientes = capacidadClientes;
	}

	@Override
	public String toString() {
		return "Almacen [idAlmacen=" + idAlmacen + ", nombre=" + nombre + ","
				+ " fechaInagura=" + fechaInagura
				+ ", capacidadClientes=" + capacidadClientes + "]";
	}
		
}
