package com.ecuador.nttdata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ecuador.nttdata.Models.MovimientosModel;

public interface IMovimientosRepo extends JpaRepository<MovimientosModel, Long> {
	

}
