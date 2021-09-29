package com.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CarritoDeSaludosBean
 */
@Stateful
@LocalBean
public class CarritoDeSaludosBean implements CarritoDeSaludosBeanRemote {

	/**
	 * Default constructor.
	 */
	public CarritoDeSaludosBean() {

	}

	private List<String> saludos = new ArrayList<String>();

	@EJB
	SaludoBeanRemote SaludoBean;

	@Override
	public void agregarSaludo(String nombre) {
		saludos.add(SaludoBean.saludar(nombre));
	}

	@Remove
	public List<String> obtenerSaludos() {
		return this.saludos;

	}

}
