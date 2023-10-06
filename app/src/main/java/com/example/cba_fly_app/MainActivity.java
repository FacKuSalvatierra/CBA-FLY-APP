package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.loginEmail);
        password =(EditText)findViewById(R.id.loginPassword);
    }
    public void iniciarSesion(View v) {
        String correo = email.getText().toString();
        String contrasena = password.getText().toString();
        if(correo.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar un Correo", Toast.LENGTH_LONG).show();
            return;
        }
        if(contrasena.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar una contraseña", Toast.LENGTH_LONG).show();
            return;
        }
        if(correo.trim().length()!=0 && contrasena.trim().length()!=0) {
            Intent login=new Intent(this, Profile.class);
            login.putExtra("dato", correo);
            startActivity(login);
            Toast.makeText(this, "Sesión iniciada correctamente", Toast.LENGTH_SHORT).show();
        }
    }
    public void goRegister(View v) {
        Intent register=new Intent(this, RegisterAccount.class);
        startActivity(register);
    }
    public void goRecovery(View v) {
        Intent recovery=new Intent(this, PasswordRecovery.class);
        startActivity(recovery);
    }
    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}