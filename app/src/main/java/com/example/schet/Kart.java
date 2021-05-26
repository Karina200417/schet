package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Kart extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View wd = inflater.inflate(R.layout.kart, container, false);
        TextView sf=wd.findViewById(R.id.nev);
        TextView ha=wd.findViewById(R.id.pravo);
        Button ff=wd.findViewById(R.id.dal);

        ff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Kart.this).navigate(R.id.action_kart_to_primkart);
            }
        });
        return wd;
    }
}