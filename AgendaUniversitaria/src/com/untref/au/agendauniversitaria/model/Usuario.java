package com.untref.au.agendauniversitaria.model;

import java.util.List;

public class Usuario {
	
	private String mUsuario;
	
	private String mContrase�a;
	
	private String mNombre;
	
	private List <Materia> mListaMaterias;

	public String getmUsuario() {
		return mUsuario;
	}

	public void setmUsuario(String mUsuario) {
		this.mUsuario = mUsuario;
	}

	public String getmContrase�a() {
		return mContrase�a;
	}

	public void setmContrase�a(String mContrase�a) {
		this.mContrase�a = mContrase�a;
	}

	public String getmNombre() {
		return mNombre;
	}

	public void setmNombre(String mNombre) {
		this.mNombre = mNombre;
	}

	public List<Materia> getmListaMaterias() {
		return mListaMaterias;
	}

	public void setmListaMaterias(List<Materia> mListaMaterias) {
		this.mListaMaterias = mListaMaterias;
	}

}
