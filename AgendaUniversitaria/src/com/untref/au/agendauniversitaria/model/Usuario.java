package com.untref.au.agendauniversitaria.model;

import java.util.List;

public class Usuario {
	
	private String mUsuario;
	
	private String mContraseña;
	
	private String mNombre;
	
	private List <Materia> mListaMaterias;

	public String getmUsuario() {
		return mUsuario;
	}

	public void setmUsuario(String mUsuario) {
		this.mUsuario = mUsuario;
	}

	public String getmContraseña() {
		return mContraseña;
	}

	public void setmContraseña(String mContraseña) {
		this.mContraseña = mContraseña;
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
