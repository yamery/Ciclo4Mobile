package com.tecnidev.feedmeapp.interfaz;

import com.tecnidev.feedmeapp.modelo.FormularioDTO;

public interface FormularioInterface {

    interface View{
        void validarResultadoFormulario(String editText, String mensaje);
        void respuestaGuardadoUsuario(Boolean respuesta);
    }

    interface Controlador {
        Boolean validarFormulario(FormularioDTO formularioDTO);
        Boolean usuarioGuardarUsuario(FormularioDTO formularioDTO);
    }

    interface Modelo {
    }
}
