//package com.tecnidev.feedmeapp.controlador;

//import com.tecnidev.feedmeapp.Login;
//import com.tecnidev.feedmeapp.interfaz.LoginInterface;

public class ControladorLogin implements LoginIterface.Controlador{
    private final LoginIterface.View view;

    public ControladorLogin (LoginIterface.View view){
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

    @Override
    public Boolean usuarioPermitido(String usuario, String clave) {
        if (usuario.equals("prueba")) {
            if (clave.equals("12345")){
                return true;
            }
        }
        return false;
    }


}
