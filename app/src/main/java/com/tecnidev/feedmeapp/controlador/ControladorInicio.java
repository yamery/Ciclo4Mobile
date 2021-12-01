//package com.tecnidev.feedmeapp.controlador;

//import android.content.Intent;

//import com.tecnidev.feedmeapp.interfaz.InicioInterface;


public class ControladorInicio implements InicioInterface.Controlador {

    InicioInterface.Controlador controlador;
    InicioInterface.View view;

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
