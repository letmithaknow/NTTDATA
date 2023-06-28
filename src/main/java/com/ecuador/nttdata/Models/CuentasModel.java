package com.ecuador.nttdata.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cuentas")
public class CuentasModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CuentaId;
	@Column(unique = true, nullable = false)
	private String NumeroCuenta;
	@Column(nullable = false)
	private String NombredeCliente;
	@Column(nullable = false)
	private String TipodeCuenta;
	@Column(nullable = false)
	private String SaldoInicial;
	@Column(nullable = false)
	private String Estado;
	
	public CuentasModel(String numeroCuenta, String nombredeCliente, String tipodeCuenta, String saldoInicial,
			String estado) {
		super();
		NumeroCuenta = numeroCuenta;
		NombredeCliente = nombredeCliente;
		TipodeCuenta = tipodeCuenta;
		SaldoInicial = saldoInicial;
		Estado = estado;
	}
	
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
	

}
