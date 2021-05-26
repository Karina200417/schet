package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Kar extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View d = inflater.inflate(R.layout.kar, container, false);
        TextView k=d.findViewById(R.id.textView);
        Button j=d.findViewById(R.id.da);

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Kar.this).navigate(R.id.action_kar_to_kaarttt);
            }  });

        return d;
    }
}