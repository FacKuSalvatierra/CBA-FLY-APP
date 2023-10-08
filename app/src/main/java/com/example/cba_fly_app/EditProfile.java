package com.example.cba_fly_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditProfile extends AppCompatActivity {
    private EditText nombreComPf, emailPf, phonePf, dniPf, codigoPosPf, countryPf, cityPf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        nombreComPf = (EditText)findViewById(R.id.inputNombreCompletoPf);
        emailPf = (EditText)findViewById(R.id.inputEmailPf);
        phonePf = (EditText)findViewById(R.id.inputPhone);
        dniPf = (EditText)findViewById(R.id.inputDNI);
        codigoPosPf = (EditText)findViewById(R.id.inputCodigoPostal);
        countryPf = (EditText)findViewById(R.id.inputCountry);
        cityPf = (EditText)findViewById(R.id.inputCity);
    }
    public void editarInfo(View v) {
        String nomcompf = nombreComPf.getText().toString();
        String correopf = emailPf.getText().toString();
        String telefonopf =  phonePf.getText().toString();
        String documentopf = dniPf.getText().toString();
        String codpospf =  codigoPosPf.getText().toString();
        String paispf = countryPf.getText().toString();
        String ciudadpf = cityPf.getText().toString();

        if(nomcompf.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar tu nombre completo", Toast.LENGTH_LONG).show();
            return;
        }
        if(correopf.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar un Correo", Toast.LENGTH_LONG).show();
            return;
        }
        if(telefonopf.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar tu número de teléfono", Toast.LENGTH_LONG).show();
            return;
        }
        if(documentopf.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar tu DNI", Toast.LENGTH_LONG).show();
            return;
        }
        if(codpospf.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar tu código postal", Toast.LENGTH_LONG).show();
            return;
        }
        if(paispf.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar tu país", Toast.LENGTH_LONG).show();
            return;
        }
        if(ciudadpf.trim().length()==0) {
            Toast.makeText(this, "Hace falta colocar tu ciudad", Toast.LENGTH_LONG).show();
            return;
        }
        if(nomcompf.trim().length()!=0 && correopf.trim().length()!=0 && telefonopf.trim().length()!=0 && documentopf.trim().length()!=0 &&
                codpospf.trim().length()!=0 && paispf.trim().length()!=0 && ciudadpf.trim().length()!=0) {
            Toast.makeText(this, "¡Información cambiada!", Toast.LENGTH_SHORT).show();
            Intent goBack=new Intent(this, Profile.class);
            startActivity(goBack);
        }
    }
    public void volverAtras(View v) {
        Intent goBack=new Intent(this, Profile.class);
        startActivity(goBack);
    }

}