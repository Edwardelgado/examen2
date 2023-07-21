package com.delgado.infraccion.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.delgado.infraccion.entity.Infraccion;


public interface InfraccionService {
	public List<Infraccion>findAll(Pageable page);
	public List<Infraccion>findByInfraccion(String nombre, Pageable page);
	public Infraccion findById(int id);
	public Infraccion findByDni (String dni);
	public Infraccion save(Infraccion infraccion);
	public Infraccion update(Infraccion infraccion);
	public void delete(int id);
	
}
