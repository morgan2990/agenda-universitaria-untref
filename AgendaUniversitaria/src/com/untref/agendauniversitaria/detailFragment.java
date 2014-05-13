package com.untref.agendauniversitaria;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class detailFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_detail, container,false);
		
		return v;
	}
	
	public void setText(String os)
	{
		TextView text = (TextView)getView().findViewById(R.id.textOs);
		
		text.setText(os);
	}
}
