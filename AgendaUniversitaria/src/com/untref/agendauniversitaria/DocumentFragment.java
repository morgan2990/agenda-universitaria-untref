package com.untref.agendauniversitaria;

import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DocumentFragment extends ListFragment {
	
	String[] oss ;
	String[] lista ;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		
		String materia = getActivity().getIntent().getExtras().getString(OsFragment.Materia);
		oss = MateriaListHelper.getDocumentos(materia);
		lista = new String [oss.length];
		
		for (int i = 0; i < oss.length ; i++){
			lista [i] = "Documento " + String.valueOf(i+1);
		}
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,lista);
		setListAdapter(adapter);
		super.onActivityCreated(savedInstanceState);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		String os = (String)getListAdapter().getItem(position);
		
		{
			Intent i = new Intent(Intent.ACTION_VIEW);
			i.setData(Uri.parse(oss[position]));
			startActivity(i);
		}
	}

}
