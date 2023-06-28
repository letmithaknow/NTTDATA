package com.ecuador.nttdata.Dto.Cuentas;

import com.ecuador.nttdata.Utils.EError;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class CuentasEntrada {

	private Long CuentaId;
	private String NumeroCuenta;
	private String NombredeCliente;
	private String TipodeCuenta;
	private String SaldoInicial;
	private String Estado;

	public Long getCuentaId() {
		return CuentaId;
	}

	public void setCuentaId(Long cuentaId) {
		CuentaId = cuentaId;
	}

	public String getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

	public String getNombredeCliente() {
		return NombredeCliente;
	}

	public void setNombredeCliente(String nombredeCliente) {
		NombredeCliente = nombredeCliente;
	}

	public String getTipodeCuenta() {
		return TipodeCuenta;
	}

	public void setTipodeCuenta(String tipodeCuenta) {
		TipodeCuenta = tipodeCuenta;
	}

	public String getSaldoInicial() {
		return SaldoInicial;
	}

	public void setSaldoInicial(String saldoInicial) {
		SaldoInicial = saldoInicial;
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
