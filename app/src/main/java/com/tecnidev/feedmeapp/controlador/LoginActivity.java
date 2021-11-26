package com.tecnidev.feedmeapp.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tecnidev.feedmeapp.interfaz.LoginIterface;
import com.tecnidev.feedmeapp.R;

public class LoginActivity extends AppCompatActivity implements LoginIterface.Controlador, View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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

    @Override
    public void onClick(View v) {

    }
}