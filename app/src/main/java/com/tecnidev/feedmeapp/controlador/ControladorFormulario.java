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

        Pattern pattern3 = Pattern.compile("/[0-9][a-zA-Z]{8}/");
        Pattern pattern4 = Pattern.compile("^[\\\\p{Alnum}]{8,120}$");

        Matcher mather = pattern.matcher(formularioDTO.getEditCorreo());
        Matcher mather2 = pattern2.matcher(formularioDTO.getEditNombres());
        Matcher mather3 = pattern4.matcher(formularioDTO.getEditUsuario());
        Matcher mather4 = pattern2.matcher(formularioDTO.getEditApellidos());
        Matcher mather5 = pattern4.matcher(formularioDTO.getEditPassword());
        Matcher mather6 = pattern3.matcher(formularioDTO.getEditNombres());


        if((formularioDTO.getEditNombres().trim().isEmpty())){
            return false;
        }else if((formularioDTO.getEditApellidos().trim().isEmpty())){
            return false;
        }else if((formularioDTO.getSpSexo().trim().isEmpty())){
            return false;
        }else if((formularioDTO.getEditDireccion().trim().isEmpty())){
            return false;
        }
        else if((formularioDTO.getEditCorreo().trim().isEmpty())){
            return false;
        }else if(!mather.find()){
            return false;
        }
        else if((formularioDTO.getEditCiudad().trim().isEmpty())){
            return false;
        }
        else if((formularioDTO.getEditCelular().trim().isEmpty())){
            return false;
        }
        else if((formularioDTO.getEditUsuario().trim().isEmpty())){
            return false;
        }else if((formularioDTO.getEditPassword().trim().isEmpty())){
            return false;
        }else if((formularioDTO.getEditPassword().trim().length()<=5)){
            return false;
        }

        else{
            UsuarioDto usuario = UsuarioDto.getInstance();
            usuario.setNombre(formularioDTO.getEditNombres());
            usuario.setApellido(formularioDTO.getEditApellidos());
            usuario.setSexo(formularioDTO.getSpSexo());
            usuario.setDireccion(formularioDTO.getEditDireccion());
            usuario.setCorreo(formularioDTO.getEditCorreo());
            usuario.setCiudad(formularioDTO.getEditCiudad());
            usuario.setCelular(formularioDTO.getEditCelular());
            usuario.setUsuario(formularioDTO.getEditUsuario());
            usuario.setPassword(formularioDTO.getEditPassword());
            return true;
        }




    }

    @Override
    public Boolean usuarioGuardarUsuario(FormularioDTO formularioDTO) {

        if(formularioDTO!=null){
            return true;
        }else{
            return false;
        }


    }
}
