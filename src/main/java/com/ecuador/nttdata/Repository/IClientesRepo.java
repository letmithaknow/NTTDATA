package com.ecuador.nttdata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecuador.nttdata.Models.ClientesModel;

public interface IClientesRepo extends JpaRepository<ClientesModel, Long> {
	

}
