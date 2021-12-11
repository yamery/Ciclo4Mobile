package com.tecnidev.feedmeapp.controlador;

import com.tecnidev.feedmeapp.interfaz.NotificacionInterfaz;
import com.tecnidev.feedmeapp.modelos.FormularioPublicacionDTO;

public class ControladorNotificacion implements NotificacionInterfaz.Controlador  {

    private final NotificacionInterfaz.View view;

    public ControladorNotificacion (NotificacionInterfaz.View view){

        this.view = view;
    }


    @Override
    public Boolean validarCampos(FormularioPublicacionDTO formularioPublicacionDTO) {


        view.respuestaValidacion("","Error de implementación");
        return false;


    }

    @Override
    public Boolean guardarPublicacion(FormularioPublicacionDTO formularioPublicacionDTO) {
        if (formularioPublicacionDTO != null){
            view.respuestaGuardado(true);
            return true;
        }
        else{
            view.respuestaGuardado(false);
            return false;
        }
    }
}
