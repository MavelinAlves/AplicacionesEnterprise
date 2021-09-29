package com.servicios;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SaludoBean
 */
@Stateless
@LocalBean
public class SaludoBean implements SaludoBeanRemote {

	/**
	 * Default constructor.
	 */
	public SaludoBean() {

	}

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
