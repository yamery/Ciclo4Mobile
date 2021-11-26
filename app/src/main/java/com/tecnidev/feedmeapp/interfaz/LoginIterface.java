package com.tecnidev.feedmeapp.interfaz;

public interface LoginIterface {

    interface View {
    }

    interface Controlador{
        Boolean validarLogin (String editText, String indicador);
        Boolean usuarioPermitido (String usuario, String clave);
    }

    interface Modelo{
    }

}