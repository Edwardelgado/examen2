package com.delgado.infraccion.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.delgado.infraccion.entity.Infraccion;
import com.delgado.infraccion.repository.InfraccionRepository;
import com.delgado.infraccion.service.InfraccionService;
import com.delgado.infraccion.validator.InfraccionValidator;


@Service
public class InfraccionServiceImpl implements InfraccionService{
	@Autowired
	private InfraccionRepository repository;
	
	@Override
	@Transactional(readOnly=true)
	public List<Infraccion>findAll(Pageable page) {
		try {
			return repository.findAll(page).toList();
			
			
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly=true)
	public List<Infraccion> findByInfraccion(String nombre, Pageable page) {
		try {
			return repository.findByInfraccionContaining(nombre, page);
     	}catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Infraccion findById(int id) {
		try {
			Infraccion registro =repository.findById(id).orElseThrow();
			return registro;
     	}catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public Infraccion save(Infraccion infraccion) {
		try {
			InfraccionValidator.save(infraccion);
			//Infraccion registro =repository.findById(infraccion.getId()).orElseThrow();
			infraccion.setActivo(true);
			infraccion=repository.save(infraccion);
			return infraccion;
			
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public Infraccion update(Infraccion infraccion) {
		try {
			
			Infraccion registro =repository.findById(infraccion.getId()).orElseThrow();
			registro.setActivo(false);
			//registro.setDni(infraccion.getDni());
			//registro.setFecha(infraccion.getFecha());
			//registro.setFalta(infraccion.getFalta());
			//registro.setInfraccion(infraccion.getInfraccion());
			//registro.setDescripcion(infraccion.getDescripcion());
			
			return repository.save(registro);
			
     	}catch (Exception e) {
			return null;
		}
	}

	@Override
	@Transactional
	public void delete(int id) {
		try {
			Infraccion registro =repository.findById(id).orElseThrow();
			repository.delete(registro);
		
     	}catch (Exception e) {
			
		}
	}

	@Override
	public Infraccion findByDni(String dni) {
		try {
			Infraccion registro =repository.findByDni(dni);
			return registro;
     	}catch (Exception e) {
			return null;
		}
	}

}
