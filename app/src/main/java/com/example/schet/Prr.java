package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Prr extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ioaj = inflater.inflate(R.layout.prr, container, false);
        TextView kkkk=ioaj.findViewById(R.id.textView10);
        Button ssss=ioaj.findViewById(R.id.button9);
        
        ssss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment
            }
        });
        return ioaj;
    }
}