
package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Nev extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View qhh =inflater.inflate(R.layout.nev, container, false);
        TextView zzzz=qhh.findViewById(R.id.textView2);
        Button bhj = qhh.findViewById(R.id.button3);
        TextView n=qhh.findViewById(R.id.textView3);

        bhj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Nev.this).navigate(R.id.action_nev2_to_kaarttt);
            }
        });
        return qhh;
    }
}