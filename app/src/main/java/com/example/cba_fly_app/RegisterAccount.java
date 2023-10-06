package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterAccount extends AppCompatActivity {
    private EditText fullNameRg, emailRg, passwordRg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);

        fullNameRg = (EditText)findViewById(R.id.inputFullNameRg);
        emailRg = (EditText)findViewById(R.id.inputEmailRg);
        passwordRg = (EditText)findViewById(R.id.inputPasswordRg);
    }

    public void crearCuenta(View v) {
        String nomcomRg = fullNameRg.getText().toString();
        String correoRg = emailRg.getText().toString();
        String contrasenaRg = passwordRg.getText().toString();
        if(nomcomRg.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar tu nombre completo", Toast.LENGTH_LONG).show();
            return;
        }
        if(correoRg.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar un Correo", Toast.LENGTH_LONG).show();
            return;
        }
        if(contrasenaRg.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar una contraseña", Toast.LENGTH_LONG).show();
            return;
        }
        if(nomcomRg.trim().length()!=0 && correoRg.trim().length()!=0 && contrasenaRg.trim().length()!=0) {
            Intent register = new Intent(this, Profile.class);
            startActivity(register);
            Toast.makeText(this, "¡Cuenta creada exitosamente!", Toast.LENGTH_LONG).show();
        }
    }

    public void goLogin(View v) {
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }
}