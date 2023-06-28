package com.ecuador.nttdata.Models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movimientos")
public class MovimientosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long MovimientoId;
	@Column(nullable = false)
	private String NombredeCliente;
	@Column(nullable = false)
	private String NumeroCuenta;
	@Column(nullable = false)
	private String TipodeCuenta;
	@Column(nullable = false)
	private String SaldoInicial;
	@Column(nullable = false)
	private String TipoMovimiento;
	@Column(nullable = false)
	private String SaldoDisponible;
	@Column(nullable = false)
	private String MovimientoMonto;
	@Column(nullable = false)
	private String FechaMovimiento;
	@Column(nullable = false)
	private String Estado;

	public Long getMovimientoId() {
		return MovimientoId;
	}

	public void setMovimientoId(Long movimientoId) {
		MovimientoId = movimientoId;
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

	public String getTipoMovimiento() {
		return TipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		TipoMovimiento = tipoMovimiento;
	}

	public String getSaldoDisponible() {
		return SaldoDisponible;
	}

	public void setSaldoDisponible(String saldoDisponible) {
		SaldoDisponible = saldoDisponible;
	}

	public String getMovimientoMonto() {
		return MovimientoMonto;
	}

	public void setMovimientoMonto(String movimientoMonto) {
		MovimientoMonto = movimientoMonto;
	}

	public String getFechaMovimiento() {
		return FechaMovimiento;
	}

	public void setFechaMovimiento(String fechaMovimiento) {
		FechaMovimiento = fechaMovimiento;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

}
