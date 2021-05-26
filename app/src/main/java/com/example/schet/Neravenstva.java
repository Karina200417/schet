package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Neravenstva extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    View ryt = inflater.inflate(R.layout.neravenstva, container, false);
    ImageView neravenstvo = ryt.findViewById(R.id.neravvenstvo);
    RadioButton verno = ryt.findViewById(R.id.verno1);
    RadioButton neverno =ryt.findViewById(R.id.neverno1);


    verno.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            NavHostFragment.findNavController(Neravenstva.this).navigate(R.id.action_neravenstva_to_ve);
        }
    });
    neverno.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            NavHostFragment.findNavController(Neravenstva.this).navigate(R.id.action_neravenstva_to_ne);
        }
    });
    return ryt;
    }
}