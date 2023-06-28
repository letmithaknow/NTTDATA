package com.ecuador.nttdata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecuador.nttdata.Models.CuentasModel;

public interface ICuentasRepo extends JpaRepository<CuentasModel, Long> {
	

}