package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.logging.Level;


public class Level1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View f2 = inflater.inflate(R.layout.level1, container, false);

        Button kartinki = f2.findViewById(R.id.kartinki);
        Button primer = f2.findViewById(R.id.primer);
        Button neravenstvo = f2.findViewById(R.id.neravenstvo);

        kartinki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Level1.this).navigate(R.id.level1_primkartinki);
            }
        });
        primer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Level1.this).navigate(R.id.level1_chislovprim);
            }
        });

        neravenstvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Level1.this).navigate(R.id.level1_neravenstva);
            }

        });
        return f2;
    }
}