package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Chislovprim21 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    View tr = inflater.inflate(R.layout.chislovprim21, container, false);
        TextView yk=tr.findViewById(R.id.primer1);
        EditText uk=tr.findViewById(R.id.otvett);
        Button ek=tr.findViewById(R.id.proverkaa);

      /* ek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String b=uk.getText().toString();
                int s=Integer.parseInt(b);
                if(s==72) {
                    ek.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavHostFragment.findNavController(Chislovprim21.this).navigate(R.id.chislovprim21_verno);
                        }
                    });
                }
                else{
                    ek.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            NavHostFragment.findNavController(Chislovprim21.this).navigate(R.id.chislovprim21_neverno);
                        }
                    });
                }
            }
        }); */
    return tr;
    }
}