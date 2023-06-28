package com.ecuador.nttdata.Services.Clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecuador.nttdata.Dto.Clientes.ClientesEntrada;
import com.ecuador.nttdata.Models.ClientesModel;
import com.ecuador.nttdata.Repository.IClientesRepo;
import com.ecuador.nttdata.Utils.EError;

@Service
public class ClientesServiceImp implements IClientService {

	@Autowired
	private IClientesRepo clientesRepo;

	@Override
	public ClientesEntrada CrearCliente(ClientesEntrada clientesEntrada) {

		EError error = new EError();
		ClientesEntrada salida = new ClientesEntrada();
		try {
			ClientesModel clientesModel = new ClientesModel(clientesEntrada.getNombres(),
					clientesEntrada.getDireccion(), clientesEntrada.getTelefono(), clientesEntrada.getContrasena(),
					clientesEntrada.getEstado());

			ClientesModel retuClientesModel = clientesRepo.save(clientesModel);

			if (retuClientesModel.equals(null)) {

				error.setErrorCode("500");
				error.setErrorMessage("Error In Base de dato, intentas mas tardes");
				salida.setError(error);
				return clientesEntrada;
			}

			salida.setClienteId(retuClientesModel.getClienteId());
			salida.setNombres(retuClientesModel.getNombres());
			salida.setContrasena(retuClientesModel.getContrasena());
			salida.setDireccion(retuClientesModel.getDireccion());
			salida.setTelefono(retuClientesModel.getTelefono());
			salida.setEstado(retuClientesModel.getEstado());

			error.setErrorCode("201");
			error.setErrorMessage("OK");
			salida.setError(error);

			return (salida);

		} catch (Exception e) {
			error.setErrorCode("500");
			error.setErrorMessage(e.getMessage());
			salida.setError(error);
			return salida;
		}

	}

}
