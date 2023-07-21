package com.delgado.infraccion.validator;

import com.delgado.infraccion.entity.Infraccion;


public class InfraccionValidator {
	public static void save(Infraccion infraccion) {
		if(infraccion.getDni()==null || infraccion.getDni().trim().isEmpty()) {
			throw new RuntimeException("El Dni es requerido");
		}
		if(infraccion.getFecha()==null ) {
			throw new RuntimeException("La fecha es requerida");
		}
		if(infraccion.getFalta()==null || infraccion.getFalta().trim().isEmpty()) {
			throw new RuntimeException("La falta es requerido");
		}
		if(infraccion.getInfraccion()==null || infraccion.getInfraccion().trim().isEmpty()) {
			throw new RuntimeException("La infraccion es requerida");
		}
	}
}
