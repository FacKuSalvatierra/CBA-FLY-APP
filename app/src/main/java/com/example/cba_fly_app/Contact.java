package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contact extends AppCompatActivity {
    private ImageButton cuboQr;
    public String urlcba = "https://cbafly-3f52e.web.app/contacto";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        cuboQr = (ImageButton)findViewById(R.id.enlaceQR);
    }
    public void goWeb(View v) {
        Intent goCbafly=new Intent(this, ActWebView.class);
        goCbafly.putExtra("sitioWeb", urlcba);
        startActivity(goCbafly);
    }
    public void volverAtras(View v) {
        Intent goBack=new Intent(this, Profile.class);
        startActivity(goBack);
    }
}