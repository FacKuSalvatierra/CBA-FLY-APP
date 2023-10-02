package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contact extends AppCompatActivity {
    private ImageButton enlaceQR = findViewById(R.id.enlaceQR);
    String urlCba = "https://cbafly-3f52e.web.app/contacto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        enlaceQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri url = Uri.parse(urlCba);
                Intent goOnline = new Intent(Intent.ACTION_VIEW,url);
                startActivity(goOnline);
            }
        });
    }
    public void volverAtras(View v) {
        Intent goBack=new Intent(this, Profile.class);
        startActivity(goBack);
    }
}