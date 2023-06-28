package com.ecuador.nttdata.Cuentas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecuador.nttdata.Dto.Cuentas.CuentasEntrada;
import com.ecuador.nttdata.Models.CuentasModel;
import com.ecuador.nttdata.Repository.ICuentasRepo;
import com.ecuador.nttdata.Services.Cuentas.CuentasServiceImp;

@SpringBootTest
class CuentasServiceTest {
	
	@InjectMocks
	private CuentasServiceImp cuentasServiceImp;

	@Mock
	private ICuentasRepo cuentasRepo;
	
	@BeforeEach
	void setup() {
		CuentasModel Model = new CuentasModel("478758", "Jose Lema", "Ahorro", "2000", "True");
		
		when(cuentasRepo.save(any())).thenReturn(Model);
	}

	@Test
	void CrearCuentas() {
		
		CuentasEntrada cuentasEntrada = new CuentasEntrada();
		cuentasEntrada.setCuentaId((long) 1234);
		cuentasEntrada.setNumeroCuenta("478758");
		cuentasEntrada.setNombredeCliente("Jose Lema");
		cuentasEntrada.setSaldoInicial("2000");
		cuentasEntrada.setTipodeCuenta("Ahorro");
		cuentasEntrada.setEstado("True");
		String ClienteNombre = "Jose Lema";		
		CuentasEntrada clientEntity = cuentasServiceImp.CrearCuentas(cuentasEntrada);
		assertEquals(ClienteNombre, clientEntity.getNombredeCliente());
		
	}

}
