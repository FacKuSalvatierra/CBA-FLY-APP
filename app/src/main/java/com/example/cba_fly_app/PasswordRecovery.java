package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PasswordRecovery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_recovery);
    }
    public void volverAtras(View v) {
        Intent goBack=new Intent(this, MainActivity.class);
        startActivity(goBack);
    }
    public void enviarCorreo(View v) {
        Toast.makeText(this, "¡Correo enviado!", Toast.LENGTH_SHORT).show();
    }
}