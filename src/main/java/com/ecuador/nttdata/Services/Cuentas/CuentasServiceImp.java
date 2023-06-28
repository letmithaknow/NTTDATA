package com.ecuador.nttdata.Services.Cuentas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecuador.nttdata.Dto.Cuentas.CuentasEntrada;
import com.ecuador.nttdata.Models.CuentasModel;
import com.ecuador.nttdata.Repository.ICuentasRepo;
import com.ecuador.nttdata.Utils.EError;

@Service
public class CuentasServiceImp implements ICuentasService {

	@Autowired
	private ICuentasRepo cuentasRepo;

	@Override
	public CuentasEntrada CrearCuentas(CuentasEntrada cuentasEntrada) {

		EError error = new EError();
		CuentasEntrada salida = new CuentasEntrada();

		try {
			CuentasModel cuentasModel = new CuentasModel(cuentasEntrada.getNumeroCuenta(),
					cuentasEntrada.getNombredeCliente(), cuentasEntrada.getTipodeCuenta(),
					cuentasEntrada.getSaldoInicial(), cuentasEntrada.getEstado());

			cuentasModel = cuentasRepo.save(cuentasModel);
			if (cuentasModel.equals(null)) {

				error.setErrorCode("500");
				error.setErrorMessage("Error In Base de dato, intentas mas tardes");
				salida.setError(error);
				return salida;
			}

			salida.setCuentaId(cuentasModel.getCuentaId());
			salida.setNumeroCuenta(cuentasModel.getNumeroCuenta());
			salida.setNombredeCliente(cuentasModel.getNombredeCliente());
			salida.setTipodeCuenta(cuentasModel.getTipodeCuenta());
			salida.setSaldoInicial(cuentasModel.getSaldoInicial());
			salida.setEstado(cuentasModel.getEstado());

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

}
