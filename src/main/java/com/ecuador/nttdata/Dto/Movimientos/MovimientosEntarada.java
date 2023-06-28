package com.ecuador.nttdata.Dto.Movimientos;



import com.ecuador.nttdata.Utils.EError;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class MovimientosEntarada {

	private Long MovimientoId;
	private String NumeroCuenta;
	private String NombredeCliente;
	private String TipodeCuenta;
	private String SaldoInicial;
	private String TipoMovimiento;
	private String SaldoDisponible;
	private String MovimientoMonto;
	private String FechaMovimiento;
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
	
	
	public EError getError() {
		return error;
	}

	public void setError(EError error) {
		this.error = error;
	}


	public EError error;
}

 
