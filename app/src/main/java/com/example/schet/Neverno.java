package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Neverno extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View or = inflater.inflate(R.layout.neverno, container, false);
        TextView nn =or.findViewById(R.id.nevernoo);
        return or;
    }
}