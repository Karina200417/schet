package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Ve extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View lr = inflater.inflate(R.layout.ve, container, false);
        TextView lj = lr.findViewById(R.id.textView8);
        Button pk = lr.findViewById(R.id.button7);
        return lr;
    }
}