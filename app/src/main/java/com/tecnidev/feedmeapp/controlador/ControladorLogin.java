package com.tecnidev.feedmeapp.controlador;

import com.tecnidev.feedmeapp.Login;
import com.tecnidev.feedmeapp.interfaz.LoginInterface;

public class ControladorLogin implements LoginInterface.Controlador{
    private final LoginInterface.View view;

    public ControladorLogin (LoginInterface.View view){
        this.view = view;
    }

    @Override
    public Boolean validarLogin(String editText, String indicador) {
        if (editText.isEmpty()){
            indicador = "Este campo no puede quedar vacio";
            return false;
        }else if (editText.length()<=4){
            indicador = "Los campos no deben ser mayor o igual a 5";
            return false;
        }else{
            return true;
        }
    }
}
