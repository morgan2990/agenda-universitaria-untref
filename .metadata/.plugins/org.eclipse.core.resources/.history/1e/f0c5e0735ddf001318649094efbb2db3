package com.untref.au.agendauniversitaria;

import android.app.Activity;
import android.os.Bundle;

import com.untref.au.agendauniversitaria.MainActivity.PlaceholderFragment;

public class ListaDocumentosActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_documentos);

		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

}
