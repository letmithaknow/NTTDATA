package com.ecuador.nttdata.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class ClientesModel {
	
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
	private String Contrasena;
	@Column(nullable = false)
	private String Estado;
	
	public  ClientesModel() {
		
	}
	
	public ClientesModel(String nombres, String direccion, String telefono, String contrasena,
			String estado) {
		super();
		Nombres = nombres;
		Direccion = direccion;
		Telefono = telefono;
		Contrasena = contrasena;
		Estado = estado;
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
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
}
