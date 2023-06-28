package com.ecuador.nttdata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecuador.nttdata.Dto.Clientes.ClientesEntrada;
import com.ecuador.nttdata.Services.Clientes.IClientService;
import com.ecuador.nttdata.Utils.EError;

@RestController
@RequestMapping("/Clientes")
public class ClientesController {

	@Autowired
	private IClientService clientService;

	@PostMapping(produces = { "application/json" })
	public ResponseEntity<ClientesEntrada> CrearCLiente(@RequestBody ClientesEntrada entity) {
		
		ClientesEntrada salida = new ClientesEntrada();
		try {

			salida = clientService.CrearCliente(entity);

			if (salida.error.getErrorMessage().toString() != "OK") {

				return new ResponseEntity<>(salida, HttpStatus.INTERNAL_SERVER_ERROR);
			}

			return new ResponseEntity<ClientesEntrada>(salida, HttpStatus.OK);

		} catch (Exception e) {
			EError error = new EError("500", e.getMessage());
			salida.setError(error);
			return new ResponseEntity<>(salida, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

}
