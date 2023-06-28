package com.ecuador.nttdata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecuador.nttdata.Dto.Cuentas.CuentasEntrada;
import com.ecuador.nttdata.Services.Cuentas.ICuentasService;
import com.ecuador.nttdata.Utils.EError;

@RestController
@RequestMapping("/Cuentas")
public class CuentasController {

	@Autowired
	private ICuentasService cuentasService;

	@PostMapping(produces = { "application/json" })
	public ResponseEntity<CuentasEntrada> CrearCLiente(@RequestBody CuentasEntrada entity) {

		CuentasEntrada salida = new CuentasEntrada();
		try {

			salida = cuentasService.CrearCuentas(entity);

			if (salida.error.getErrorMessage() != "OK") {

				return new ResponseEntity<>(salida, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return new ResponseEntity<CuentasEntrada>(salida, HttpStatus.OK);

		} catch (Exception e) {
			EError error = new EError("500", e.getMessage());
			salida.setError(error);
			return new ResponseEntity<>(salida, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
