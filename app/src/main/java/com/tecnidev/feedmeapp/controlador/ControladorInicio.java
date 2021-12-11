//package com.tecnidev.feedmeapp.controlador;

//import android.content.Intent;

//import com.tecnidev.feedmeapp.interfaz.InicioInterface;


import java.util.List;

public class ControladorInicio implements InicioInterface.Controlador {

    //InicioInterface.Controlador controlador;

    private final InicioInterface.View view;

    public ControladorInicio (InicioInterface.View view){
        this.view = view;

    }



    @Override
    public void recuperarLista() {

    }

    @Override
    public void salirApp() {


    }



}
