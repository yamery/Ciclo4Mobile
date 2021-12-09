package com.tecnidev.feedmeapp.controlador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tecnidev.feedmeapp.R;
import com.tecnidev.feedmeapp.modelo.PublicacionesDTO;

import java.util.ArrayList;
import java.util.List;

public class FoodsFragment extends Fragment {

    // Attributes
    private RecyclerView recyclerView;
    private FoodsAdapter foodsAdapter;

    // Required empty public constructor
    public FoodsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load data to RecyclerView from Adapter
        recyclerView = getView().findViewById(R.id.recyclerViewFoods);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        foodsAdapter = new FoodsAdapter(obtenerPublicaciones());
        recyclerView.setAdapter(foodsAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_foods, container, false);
    }

    public List<PublicacionesDTO> obtenerPublicaciones(){
        List<PublicacionesDTO> publicaciones = new ArrayList<>();
        // TODO: Fill list from database
        return publicaciones;
    }
}