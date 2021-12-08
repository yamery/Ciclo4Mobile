package com.tecnidev.feedmeapp.controlador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.tecnidev.feedmeapp.R;
import com.tecnidev.feedmeapp.interfaz.FormularioInterface;
import com.tecnidev.feedmeapp.modelo.FormularioDTO;
import com.tecnidev.feedmeapp.modelo.UsuarioDTO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener, FormularioInterface.Controlador {

    // Instance of usuarioDTO object
    private FormularioDTO formularioDTO;

    // RegisterActivty components
    Button registerButton;
    EditText nombres;
    EditText apellidos;
    Spinner sexo;
    EditText direccion;
    EditText correo;
    ImageView foto;
    EditText ciudad;
    EditText telefono;
    EditText usuario;
    EditText clave;
    Button btnFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Components for user instance
        nombres = findViewById(R.id.editNombres);
        apellidos = findViewById(R.id.editApellidos);
        sexo = findViewById(R.id.spinnerSexo);
        direccion = findViewById(R.id.editDireccion);
        correo = findViewById(R.id.editCorreo);
        foto = findViewById(R.id.imageViewFoto);
        ciudad = findViewById(R.id.editCiudad);
        telefono = findViewById(R.id.editPhone);
        usuario = findViewById(R.id.editRegisterUsuario);
        clave = findViewById(R.id.editPassword);
        btnFoto = findViewById(R.id.btnFoto);

        // Take a picture for user profile
        btnFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });

        // Action for Register
        registerButton = findViewById(R.id.btnGuardar);
        registerButton.setOnClickListener(this);
    }

    // Register an user
    @Override
    public void onClick(View v) {
        // Instance of FormularioDTO to match data
        formularioDTO = new FormularioDTO();
        formularioDTO.setEditNombres(nombres.getText().toString());
        formularioDTO.setEditApellidos(apellidos.getText().toString());
        formularioDTO.setSpSexo(sexo.getSelectedItem().toString());
        formularioDTO.setEditDireccion(direccion.getText().toString());
        formularioDTO.setEditCorreo(correo.getText().toString());
        formularioDTO.setEditCiudad(ciudad.getText().toString());
        formularioDTO.setEditCelular(telefono.getText().toString());
        formularioDTO.setEditUsuario(usuario.getText().toString());
        formularioDTO.setEditPassword(clave.getText().toString());
        // Check if valid data
        if(usuarioGuardarUsuario(formularioDTO)){
            // Save user if fields are valid
            if (validarFormulario(formularioDTO)){
                // TODO: Save user to database
                Toast.makeText(this, "Usuario guardado", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Todos los campos son necesarios", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Debe llenar los campos antes de enviar", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public Boolean validarFormulario(FormularioDTO formularioDTO) {
        // Patterns to match form fields
        Pattern patternCorreo = Pattern.compile("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Pattern patternNombres = Pattern.compile("[A-Za-z]{8,}");
        Pattern patternUsuario = Pattern.compile("/[0-9][a-zA-Z]{8}/");
        Pattern patternClave = Pattern.compile("^[\\\\p{Alnum}]{8,120}$");
        // Matchers for patterns (some patterns able to repeat)
        Matcher matcherCorreo = patternCorreo.matcher(formularioDTO.getEditCorreo());
        Matcher matcherNombres = patternNombres.matcher(formularioDTO.getEditNombres());
        Matcher matcherApellidos = patternNombres.matcher(formularioDTO.getEditApellidos());
        Matcher matcherUsuario = patternUsuario.matcher(formularioDTO.getEditUsuario());
        Matcher matcherClave = patternClave.matcher(formularioDTO.getEditPassword());

        // Validate fields
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
        }else if(!matcherCorreo.find()){
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
        else {
            // Instance user model to save
            UsuarioDTO usuario = UsuarioDTO.getInstance();
            usuario.setName(formularioDTO.getEditNombres());
            usuario.setSurname(formularioDTO.getEditApellidos());
            usuario.setGender(formularioDTO.getSpSexo());
            usuario.setAddress(formularioDTO.getEditDireccion());
            usuario.setEmail(formularioDTO.getEditCorreo());
            usuario.setCity(formularioDTO.getEditCiudad());
            usuario.setMobile(formularioDTO.getEditCelular());
            usuario.setUser(formularioDTO.getEditUsuario());
            usuario.setPass(formularioDTO.getEditPassword());
            return true;
        }
    }

    @Override
    public Boolean usuarioGuardarUsuario(FormularioDTO formularioDTO) {
        return formularioDTO != null;
    }

    // Open camera
    private void openCamera(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager()) != null){
            startActivityForResult(intent, 1);
        }
    }

    // Result for picture taken from camera and set form picture
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imgBitmap = (Bitmap) extras.get("data");
            foto.setImageBitmap(imgBitmap);
        }
    }
}