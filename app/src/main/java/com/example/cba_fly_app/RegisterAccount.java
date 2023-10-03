package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisterAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_account);
    }

    public void crearCuenta(View v) {
        Intent register = new Intent(this, Profile.class);
        startActivity(register);
        Toast.makeText(this, "¡Cuenta creada exitosamente!", Toast.LENGTH_LONG).show();
    }

    public void goLogin(View v) {
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }
}