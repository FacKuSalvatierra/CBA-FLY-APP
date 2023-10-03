package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = findViewById(R.id.loginEmail);
        EditText password = findViewById(R.id.loginPassword);
    }
    public void iniciarSesion(View v) {
        Intent login=new Intent(this, Profile.class);
        startActivity(login);
        Toast.makeText(this, "Sesión iniciada correctamente.", Toast.LENGTH_LONG).show();
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