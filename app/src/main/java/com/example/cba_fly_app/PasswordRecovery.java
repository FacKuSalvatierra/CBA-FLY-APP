package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordRecovery extends AppCompatActivity {
    private EditText emailRec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);

        emailRec = (EditText)findViewById(R.id.inputRecoveryEmail);
    }
    public void enviarCorreo(View v) {
        String correoRec = emailRec.getText().toString();
        if(correoRec.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar un Correo", Toast.LENGTH_LONG).show();
            return;
        }
        if(correoRec.trim().length()!=0) {
            Toast.makeText(this, "¡Correo enviado!", Toast.LENGTH_SHORT).show();
        }
    }
    public void volverAtras(View v) {
        Intent goBack=new Intent(this, MainActivity.class);
        startActivity(goBack);
    }
}