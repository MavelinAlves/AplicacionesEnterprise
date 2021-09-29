package com.servicios;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface CarritoDeSaludosBeanRemote {

	void agregarSaludo(String saludar);

	public List<String> obtenerSaludos();
	
}
