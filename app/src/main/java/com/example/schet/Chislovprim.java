package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public class Chislovprim extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tg=inflater.inflate(R.layout.chislovprim, container, false);
        TextView primerchik = tg.findViewById(R.id.primerr);
        RadioButton otv1 = tg.findViewById(R.id.otvet1);
        RadioButton otv2 = tg.findViewById(R.id.otvet2);
        RadioButton otv3 = tg.findViewById(R.id.otvet3);

        otv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Chislovprim.this).navigate(R.id.action_chislovprim_to_verno);
            }
        });
        otv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Chislovprim.this).navigate(R.id.action_chislovprim_to_neverno);
            }
        });
        otv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Chislovprim.this).navigate(R.id.action_chislovprim_to_neverno);
            }
        });

        return tg;
    }
}