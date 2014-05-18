package com.untref.au.agendauniversitaria.model;

public class Documento {

	private String mCodigo;
	private String mNombre;
	private String mLink;
	private Materia mMateria;

	public String getmCodigo() {
		return mCodigo;
	}

	public void setmCodigo(String mCodigo) {
		this.mCodigo = mCodigo;
	}

	public String getmNombre() {
		return mNombre;
	}

	public void setmNombre(String mNombre) {
		this.mNombre = mNombre;
	}

	public String getmLink() {
		return mLink;
	}

	public void setmLink(String mLink) {
		this.mLink = mLink;
	}

	public Materia getmMateria() {
		return mMateria;
	}

	public void setmMateria(Materia mMateria) {
		this.mMateria = mMateria;
	}

}
