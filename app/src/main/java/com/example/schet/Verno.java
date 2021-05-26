package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Verno extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View yt = inflater.inflate(R.layout.verno, container, false);
        TextView vv = yt.findViewById(R.id.vernoo);
        return yt;
    }
}