package com.tecnidev.feedmeapp.controlador;

import com.tecnidev.feedmeapp.interfaz.LoginInterface;

public class ControladorLogin implements LoginInterface.Controlador {

    private final LoginInterface.View view;

    public ControladorLogin(LoginInterface.View view){
        this.view = view;
    }

    @Override
    public Boolean validarLogin(String editText, String indicador) {
        return null;
    }
}
