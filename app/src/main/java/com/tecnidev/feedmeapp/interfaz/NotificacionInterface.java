package com.tecnidev.feedmeapp.interfaz;

import com.tecnidev.feedmeapp.modelo.FormularioPublicacionDTO;

public interface NotificacionInterface {

    interface View {
        String respuestaValidacion(String sr, String st);
        Boolean respuestaGuardado(Boolean b);
    }

    interface Controlador {
        Boolean validarCampos(FormularioPublicacionDTO formularioPublicacionDTO);
        Boolean guardarPublicacion(FormularioPublicacionDTO formularioPublicacionDTO);
    }

    interface  Modelo {
    }
}
