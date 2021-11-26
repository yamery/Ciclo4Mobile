package com.tecnidev.feedmeapp.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.tecnidev.feedmeapp.interfaz.LoginIterface;
import com.tecnidev.feedmeapp.R;

public class LoginActivity extends AppCompatActivity implements LoginIterface.Controlador, View.OnClickListener {

    // LoginActivity components
    Button login;
    EditText user, pass;
    ImageButton facebook, gmail;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Components
        user = (EditText)findViewById(R.id.editRegisterUsuario);
        pass = (EditText)findViewById(R.id.editPassword);
        login = (Button)findViewById(R.id.btnIngresar);
        login.setOnClickListener(this);
        facebook = (ImageButton)findViewById(R.id.btnFacebook);
        gmail = (ImageButton)findViewById(R.id.btnGmail);


        // Open up RegisterActivity on click to txtRegistrarse
        register = (TextView)findViewById(R.id.txtRegistrarse);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerActivity = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registerActivity);
            }
        });
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

    public void buttonFacebookOnClick(){

    }

    public void buttonGmailOnClick(){

    }
}