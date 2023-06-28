package com.ecuador.nttdata.Services.Movimientos;

import java.util.List;

import com.ecuador.nttdata.Dto.Movimientos.MovimientosEntarada;
import com.ecuador.nttdata.Dto.Movimientos.MovimientosReportesSalida;


public interface IMovimientosService {
	
	MovimientosEntarada CrearMovimientos(MovimientosEntarada movimientosEntarada);
	List<MovimientosReportesSalida> Reportes(String user, String date);
	

}
