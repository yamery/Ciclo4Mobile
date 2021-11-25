//package com.tecnidev.feedmeapp.controlador;

//import com.tecnidev.feedmeapp.interfaz.FormularioInterfaz;
//import com.tecnidev.feedmeapp.modelos.FormularioDTO;
//import com.tecnidev.feedmeapp.modelos.UsuarioDto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControladorFormulario implements FormularioInterfaz.Controlador {

    private final FormularioInterfaz.View view;

    public ControladorFormulario(FormularioInterfaz.View view){this.view=view;}


    @Override
    public Boolean validarFormulario(FormularioDTO formularioDTO) {
        System.out.println(formularioDTO);
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Pattern pattern2 = Pattern.compile("[A-Za-z]{8,}");

        Pattern pattern3 = Pattern.compile("/[a-zA-Z0-9]{8}/");
        Pattern pattern4 = Pattern.compile("/[a-zA-Z]{5}/");

        Matcher mather = pattern.matcher(formularioDTO.getEditCorreo());
        Matcher mather2 = pattern2.matcher(formularioDTO.getEditNombres());
        Matcher mather3 = pattern2.matcher(formularioDTO.getEditUsuario());
        Matcher mather4 = pattern2.matcher(formularioDTO.getEditApellidos());
        Matcher mather5 = pattern3.matcher(formularioDTO.getEditPassword());
        Matcher mather6 = pattern3.matcher(formularioDTO.getEditNombres());


        if((formularioDTO.getEditPassword().isEmpty())){
            return false;
        }
        else{
            return true;
        }




    }

    @Override
    public Boolean usuarioGuardarUsuario(FormularioDTO formularioDTO) {
    return null;


    }
}
