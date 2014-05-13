package com.untref.agendauniversitaria;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class OsFragment extends ListFragment{

	public static final String Materia = "OS";

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		String[] oss = {"Analisis Matematico 2", "Fisica 1", "Lenguajes de Programacion 1"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,oss);
		setListAdapter(adapter);
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		String os = (String)getListAdapter().getItem(position);
		
		{
			Intent i = new Intent(getActivity(),DetailActivity.class);
			i.putExtra(Materia, os);
			startActivity(i);
		}
	}
}
