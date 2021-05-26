package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Ne extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ml = inflater.inflate(R.layout.ne, container, false);
        TextView kg=ml.findViewById(R.id.textView6);
        TextView kf=ml.findViewById(R.id.textView7);
        Button hf=ml.findViewById(R.id.button6);

        return ml;
    }
}