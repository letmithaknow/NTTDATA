package com.ecuador.nttdata.Services.Movimientos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecuador.nttdata.Dto.Movimientos.MovimientosEntarada;
import com.ecuador.nttdata.Dto.Movimientos.MovimientosReportesSalida;
import com.ecuador.nttdata.Models.MovimientosModel;
import com.ecuador.nttdata.Repository.IMovimientosRepo;
import com.ecuador.nttdata.Utils.EError;

@Service
public class MovimientosImp implements IMovimientosService {

	@Autowired
	private IMovimientosRepo movimientosRepo;

	@Override
	public MovimientosEntarada CrearMovimientos(MovimientosEntarada movimientosEntarada) {

		EError error = new EError("", "");
		MovimientosEntarada salida = new MovimientosEntarada();
		try {

			// Conditions 1
			if (Integer.parseInt(movimientosEntarada.getSaldoInicial()) <= 0
					&& movimientosEntarada.getTipoMovimiento().equals("Retiro")) {

				error.setErrorCode("500");
				error.setErrorMessage("Saldo no disponible");
				salida.setError(error);
				return salida;
			}

			// Condition New2
			int Movimientomonto = Integer.parseInt(movimientosEntarada.getMovimientoMonto());
			int SaldoInitial = Integer.parseInt(movimientosEntarada.getSaldoInicial());
			int SaldoDisponible = 0;

			if (movimientosEntarada.getTipoMovimiento().equals("Retiro")) {

				SaldoDisponible = SaldoInitial - Movimientomonto;
			}

			if (movimientosEntarada.getTipoMovimiento().equals("Deposito")) {

				SaldoDisponible = SaldoInitial + Movimientomonto;
			}

			MovimientosModel movimientosModel = new MovimientosModel();

			movimientosModel.setNumeroCuenta(movimientosEntarada.getNumeroCuenta());
			movimientosModel.setNombredeCliente(movimientosEntarada.getNombredeCliente());
			movimientosModel.setTipodeCuenta(movimientosEntarada.getTipodeCuenta());
			movimientosModel.setSaldoInicial(movimientosEntarada.getSaldoInicial());
			movimientosModel.setTipoMovimiento(movimientosEntarada.getTipoMovimiento());
			movimientosModel.setSaldoDisponible(Integer.toString(SaldoDisponible));
			movimientosModel.setMovimientoMonto(movimientosEntarada.getMovimientoMonto());
			movimientosModel.setFechaMovimiento(movimientosEntarada.getFechaMovimiento());
			movimientosModel.setEstado(movimientosEntarada.getEstado());

			movimientosModel = movimientosRepo.save(movimientosModel);

			if (movimientosModel.equals(null)) {

				error.setErrorCode("500");
				error.setErrorMessage("Error In Base de dato, intentas mas tardes");
				salida.setError(error);
				return salida;
			}

			salida.setMovimientoId(movimientosModel.getMovimientoId());
			salida.setNumeroCuenta(movimientosModel.getNumeroCuenta());
			salida.setNombredeCliente(movimientosModel.getNombredeCliente());
			salida.setTipodeCuenta(movimientosModel.getTipodeCuenta());
			salida.setSaldoInicial(movimientosModel.getSaldoInicial());
			salida.setTipoMovimiento(movimientosModel.getTipoMovimiento());
			salida.setSaldoDisponible(movimientosModel.getSaldoDisponible());
			salida.setMovimientoMonto(movimientosModel.getMovimientoMonto());
			salida.setFechaMovimiento(movimientosModel.getFechaMovimiento());
			salida.setEstado(movimientosModel.getEstado());

			error.setErrorCode("201");
			error.setErrorMessage("OK");
			salida.setError(error);
			return salida;

		} catch (Exception e) {
			error.setErrorCode("500");
			error.setErrorMessage(e.getMessage());
			salida.setError(error);
			return salida;

		}

	}

	@Override
	public List<MovimientosReportesSalida> Reportes(String user, String date) {

		List<MovimientosReportesSalida> lstSalida = new ArrayList<MovimientosReportesSalida>();
		try {
			List<MovimientosModel> allMovimientos = movimientosRepo.findAll();
			MovimientosReportesSalida salida = new MovimientosReportesSalida();

			for (MovimientosModel a : allMovimientos) {

				if (a.getNumeroCuenta().equals(user) && a.getFechaMovimiento().equals(date)) {

					salida.setMovimientoId(a.getMovimientoId());
					salida.setNumeroCuenta(a.getNumeroCuenta());
					salida.setNombredeCliente(a.getNombredeCliente());
					salida.setTipodeCuenta(a.getTipodeCuenta());
					salida.setSaldoInicial(a.getSaldoInicial());
					salida.setTipoMovimiento(a.getTipoMovimiento());
					salida.setSaldoDisponible(a.getSaldoDisponible());
					salida.setMovimientoMonto(a.getMovimientoMonto());
					salida.setFechaMovimiento(a.getFechaMovimiento());
					salida.setEstado(a.getEstado());
					lstSalida.add(salida);
				}
			}

			return lstSalida;

		} catch (Exception e) {
			return lstSalida;
		}

	}

}
