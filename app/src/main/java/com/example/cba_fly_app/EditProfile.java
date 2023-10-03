package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class EditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }
    public void editarInfo(View v) {
        Toast.makeText(this, "¡Información cambiada!", Toast.LENGTH_LONG).show();
        Intent goBack=new Intent(this, Profile.class);
        startActivity(goBack);
    }
    public void volverAtras(View v) {
        Intent goBack=new Intent(this, Profile.class);
        startActivity(goBack);
    }

}