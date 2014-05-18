package com.untref.au.agendauniversitaria.interfaces;

import com.untref.au.agendauniversitaria.model.Usuario;

public interface UsuarioService {
	public Usuario login();
	public boolean isLogggedIn();
	public void logout();
	
	public Usuario getUsuario();
}
