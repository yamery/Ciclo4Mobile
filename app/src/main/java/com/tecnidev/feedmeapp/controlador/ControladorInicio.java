//package com.tecnidev.feedmeapp.controlador;

//import android.content.Intent;

//import com.tecnidev.feedmeapp.interfaz.InicioInterface;


import java.util.ArrayList;
import java.util.List;

public class ControladorInicio implements InicioInterface.Controlador {


    InicioInterface.View view;

    public ControladorInicio (InicioInterface.View view){
        this.view = view;

    }


    @Override
    public void recuperarLista() {
        List myArrayList = new ArrayList();
        view.mostrarLista(myArrayList);
    }

    @Override
    public void salirApp() {
        view.respuestaSalirApp();
    }

}
