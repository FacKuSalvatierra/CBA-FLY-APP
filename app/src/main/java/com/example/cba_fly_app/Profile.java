package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView saludo = (TextView)findViewById(R.id.profileTitle);

        String dato = getIntent().getStringExtra("dato");
        saludo.setText("Hola" + dato);
    }
    public void goBooking(View v) {
        Intent book=new Intent(this, Booking.class);
        startActivity(book);
    }
    public void goEdit(View v) {
        Intent profedit=new Intent(this, EditProfile.class);
        startActivity(profedit);
    }
    public void goContact(View v) {
        Intent contct=new Intent(this, Contact.class);
        startActivity(contct);
    }
    public void cerrarSesion(View v) {
        Intent logout=new Intent(this, MainActivity.class);
        startActivity(logout);
        Toast.makeText(this, "Sesión cerrada correctamente.", Toast.LENGTH_LONG).show();
    }
}