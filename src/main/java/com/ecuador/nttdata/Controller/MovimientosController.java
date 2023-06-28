package com.ecuador.nttdata.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecuador.nttdata.Dto.Movimientos.MovimientosEntarada;
import com.ecuador.nttdata.Dto.Movimientos.MovimientosReportesSalida;
import com.ecuador.nttdata.Services.Movimientos.IMovimientosService;
import com.ecuador.nttdata.Utils.EError;

@RestController
@RequestMapping("/Movimientos")
public class MovimientosController {

	@Autowired
	private IMovimientosService movimientosService;

	@PostMapping(produces = { "application/json" })
	public ResponseEntity<MovimientosEntarada> CrearCLiente(@RequestBody MovimientosEntarada entity) {

		MovimientosEntarada salida = new MovimientosEntarada();
		try {

			salida = movimientosService.CrearMovimientos(entity);

			if (salida.error.getErrorMessage().toString() != "OK") {

				return new ResponseEntity<MovimientosEntarada>(salida, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return new ResponseEntity<>(salida, HttpStatus.OK);

		} catch (Exception e) {
			EError error = new EError("500", e.getMessage());
			salida.setError(error);
			return new ResponseEntity<MovimientosEntarada>(salida, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/Reportes/{user}/{date}")
	public ResponseEntity<List<MovimientosReportesSalida>> Reportes(@PathVariable String user,
			@PathVariable String date) {
		List<MovimientosReportesSalida> movimientosReportesSalidas = new ArrayList<MovimientosReportesSalida>();
		movimientosReportesSalidas = movimientosService.Reportes(user, date);
		if (movimientosReportesSalidas.size() <= 0) {

		}
		return new ResponseEntity<List<MovimientosReportesSalida>>(movimientosService.Reportes(user, date),
				HttpStatus.OK);

	}
}
