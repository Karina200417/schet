package com.example.schet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Kaarttt extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View gkj=inflater.inflate(R.layout.kaarttt, container, false);
        ImageView qwet=gkj.findViewById(R.id.imvv);
        ImageView rtyo=gkj.findViewById(R.id.iiimmv);
        TextView lfj=gkj.findViewById(R.id.textView9);
        EditText sjk=gkj.findViewById(R.id.edt);
        Button ald=gkj.findViewById(R.id.button8);


       return gkj;
    }
}