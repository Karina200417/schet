package com.example.schet;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Yrovni extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View f1 = inflater.inflate(R.layout.yrovni, container, false);
        Button l1 = f1.findViewById(R.id.l1);
        Button l2 = f1.findViewById(R.id.l2);
        Button l3 = f1.findViewById(R.id.l3);
        Button l4 = f1.findViewById(R.id.l4);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Yrovni.this).navigate(R.id.yrovni_level1);
            }

        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Yrovni.this).navigate(R.id.yrovni_level234);
            }

        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Yrovni.this).navigate(R.id.yrovni_level234);
            }

        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Yrovni.this).navigate(R.id.yrovni_level234);
            }

        });
        return f1;
    }
}