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

public class Primkartinki extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View f3 = inflater.inflate(R.layout.primkartinki, container, false);
        final EditText otvet = (EditText) f3.findViewById(R.id.otvet);
        TextView plus = f3.findViewById(R.id.plus);
        TextView ravno = f3.findViewById(R.id.ravno);
        ImageView im1 = f3.findViewById(R.id.im1);
        ImageView im2 = f3.findViewById(R.id.im2);
        Button proverka = f3.findViewById(R.id.proverka);

        /*proverka.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View v) {
                if(p1.getText().toString().length()<1){
                    Toast.makeText(getContext(),"dfkfjhs", Toast.LENGTH_LONG).show();} } });*/

        proverka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = otvet.getText().toString();
                int numm = Integer.parseInt(a);
                if (numm == 2) {
                    proverka.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavHostFragment.findNavController(Primkartinki.this).navigate(R.id.action_primkartinki_to_ttt);
                        }
                    });
                } else {
                    proverka.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavHostFragment.findNavController(Primkartinki.this).navigate(R.id.action_primkartinki_to_kart);
                        }

                    });
                }
            }
    });
   return f3;
    }
}