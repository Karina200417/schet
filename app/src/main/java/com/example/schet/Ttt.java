
package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Ttt extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ugh = inflater.inflate(R.layout.ttt, container, false);
        TextView fjj = ugh.findViewById(R.id.textView4);
        Button ld = ugh.findViewById(R.id.button4);

        ld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(Ttt.this).navigate(R.id.action_ttt_to_primkart);
            }
        });
        return ugh;
    }
}