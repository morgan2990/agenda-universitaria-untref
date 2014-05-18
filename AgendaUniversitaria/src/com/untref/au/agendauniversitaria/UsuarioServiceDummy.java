package com.untref.au.agendauniversitaria;

import java.util.ArrayList;
import java.util.List;

import com.untref.au.agendauniversitaria.interfaces.UsuarioService;
import com.untref.au.agendauniversitaria.model.Materia;
import com.untref.au.agendauniversitaria.model.Usuario;

public class UsuarioServiceDummy implements UsuarioService{
	
	public static boolean isLoggedIn = false;
	
	private static UsuarioServiceDummy instance;
	
	private Usuario usuario;
	
	private UsuarioServiceDummy (){
	}
	
	public static UsuarioServiceDummy getInstance (){
		if (instance == null){
			instance = new UsuarioServiceDummy();
		}
		return instance;
	}

	@Override
	public Usuario login() {
		
		usuario = new  Usuario();
		usuario.setmNombre("Rodrigo");
		usuario.setmUsuario("foo@example.com");
		usuario.setmContraseña("hello");
		Materia materia1 = new Materia();
		materia1.setmCodigo("lp1");
		materia1.setmNombre("Lenguajes de Programacion 1");
		Materia materia2 = new Materia();
		materia2.setmCodigo("lp2");
		materia2.setmNombre("Lenguajes de Programacion 2");
		List <Materia> materias = new ArrayList <Materia> ();
		materias.add(materia1);
		materias.add(materia2);
		usuario.setmListaMaterias(materias);
		return usuario;
		
	}

	@Override
	public boolean isLogggedIn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Usuario getUsuario(){
		return usuario;
	}
}
