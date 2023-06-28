package com.ecuador.nttdata.Clientes;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.ecuador.nttdata.Dto.Clientes.ClientesEntrada;
import com.ecuador.nttdata.Models.ClientesModel;
import com.ecuador.nttdata.Repository.IClientesRepo;
import com.ecuador.nttdata.Services.Clientes.ClientesServiceImp;

@SpringBootTest
class ClienteServiceTest {

	@InjectMocks
	private ClientesServiceImp clientesServiceImp;

	@Mock
	private IClientesRepo clientesRepo;

	@BeforeEach
	void setup() {
		ClientesModel Model = new ClientesModel("Madhumitha", "1234", "Ecuador", "098945761", "True");
		Model.setClienteId((long) (1234));
		Mockito.when(clientesRepo.save(any())).thenReturn(Model);
	}

	@Test
	public void CrearCliente() {
		ClientesEntrada clientesEntrada = new ClientesEntrada();
		clientesEntrada.setClienteId((long) 1234);
		clientesEntrada.setNombres("Madhumitha");
		clientesEntrada.setContrasena("1234");
		clientesEntrada.setDireccion("Ecuador");
		clientesEntrada.setTelefono("098945761");
		clientesEntrada.setEstado("True");
		String ClienteNombre = "Madhumitha";
		ClientesEntrada clientEntity = clientesServiceImp.CrearCliente(clientesEntrada);
		assertEquals(ClienteNombre, clientEntity.getNombres());
	}

}
