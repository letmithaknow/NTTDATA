package com.ecuador.nttdata.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ClienteId;
	@Column(nullable = false)
	private String Nombres;
	@Column(nullable = false)
	private String Direccion;
	@Column(nullable = false)
	private String Telefono;	
	@Column(nullable = false)
	private String Genero;
	@Column(nullable = false)
	private String Edad;
	@Column(nullable = false)
	private String identificación;
	
	
	
	public Persona(Long clienteId, String nombres, String direccion, String telefono, String genero, String edad,
			String identificación) {
		super();
		ClienteId = clienteId;
		Nombres = nombres;
		Direccion = direccion;
		Telefono = telefono;
		Genero = genero;
		Edad = edad;
		this.identificación = identificación;
	}
	public Long getClienteId() {
		return ClienteId;
	}
	public void setClienteId(Long clienteId) {
		ClienteId = clienteId;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getEdad() {
		return Edad;
	}
	public void setEdad(String edad) {
		Edad = edad;
	}
	public String getIdentificación() {
		return identificación;
	}
	public void setIdentificación(String identificación) {
		this.identificación = identificación;
	}
	


}
