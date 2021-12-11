package com.tecnidev.feedmeapp.interfaz;

import com.tecnidev.feedmeapp.modelos.FormularioPublicacionDTO;

public interface NotificacionInterfaz {

    interface View {


        String respuestaValidacion(String sr,String st );
        Boolean respuestaGuardado(Boolean b);

    }
    interface Controlador{

        Boolean validarCampos(FormularioPublicacionDTO formularioPublicacionDTO);
        Boolean guardarPublicacion(FormularioPublicacionDTO formularioPublicacionDTO);


    }
    interface  Modelo{

    }
}
