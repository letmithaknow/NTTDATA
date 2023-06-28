package com.ecuador.nttdata.Dto.Clientes;

import com.ecuador.nttdata.Utils.EError;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class ClientesEntrada {

	private Long ClienteId;
	private String Nombres;
	private String Direccion;
	private String Telefono;
	private String Contrasena;
	private String Estado;

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
	public EError getError() {
		return error;
	}

	public void setError(EError error) {
		this.error = error;
	}


	public EError error;

}
