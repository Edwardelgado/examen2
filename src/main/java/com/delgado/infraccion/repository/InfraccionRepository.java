package com.delgado.infraccion.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delgado.infraccion.entity.Infraccion;


@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer>{
	public Infraccion findByDni(String dni);
	List<Infraccion>findByInfraccionContaining (String nombre, Pageable page);
	
}
