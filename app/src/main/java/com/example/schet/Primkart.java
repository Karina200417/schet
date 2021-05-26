package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Primkart extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View tot=inflater.inflate(R.layout.primkart, container, false);
        ImageView rkk=tot.findViewById(R.id.banana);
        ImageView rt=tot.findViewById(R.id.banan);
        TextView ykp=tot.findViewById(R.id.pluss);
        EditText edfg=tot.findViewById(R.id.otvettt);
        Button rr=tot.findViewById(R.id.proverkka);


        rr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hn =edfg.getText().toString();
                int ch=Integer.parseInt(hn);
                if (ch == 3) {
                    rr.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavHostFragment.findNavController(Primkart.this).navigate(R.id.action_primkart_to_kar);
                        }
                    });
                }
                else {
                    rr.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavHostFragment.findNavController(Primkart.this).navigate(R.id.action_primkart_to_nev2);
                        }
                    });
                }
            }
        });
        return tot;
    }
}