package com.untref.au.agendauniversitaria;

import java.util.HashMap;
import java.util.Map;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.untref.au.agendauniversitaria.interfaces.UsuarioService;
import com.untref.au.agendauniversitaria.model.Materia;

public class ListaMateriasFragment extends ListFragment{
	
	public static final String Materia = "materia";
	
	UsuarioService usuarioService = UsuarioServiceDummy.getInstance();
	
	Map <String, String> materiasMap;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Materia[] materias = (com.untref.au.agendauniversitaria.model.Materia[]) usuarioService.getUsuario().getmListaMaterias().toArray();
		materiasMap= new HashMap<String, String> ();
		for (Materia eachMateria:materias){
			materiasMap.put(eachMateria.getmNombre(), eachMateria.getmCodigo());
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, (String[]) materiasMap.keySet().toArray());
		setListAdapter(adapter);
		super.onActivityCreated(savedInstanceState);
	}	
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		String materia = (String)getListAdapter().getItem(position);
		String codMateria = materiasMap.get(materia);
		{
			Intent i = new Intent(getActivity(), ListaDocumentosActivity.class);
			i.putExtra(Materia, codMateria);
		}
		super.onListItemClick(l, v, position, id);
	}
	
}
