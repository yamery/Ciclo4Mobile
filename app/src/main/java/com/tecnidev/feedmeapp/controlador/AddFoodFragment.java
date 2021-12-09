package com.tecnidev.feedmeapp.controlador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.tecnidev.feedmeapp.R;

public class AddFoodFragment extends Fragment {

    // Components
    EditText nombreAlimento;
    EditText fechaVencimiento;
    EditText tipoAlimento;
    EditText comentario;
    ImageView fotoAlimento;

    // Required empty public constructor
    public AddFoodFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Assign components

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_food, container, false);
    }
}