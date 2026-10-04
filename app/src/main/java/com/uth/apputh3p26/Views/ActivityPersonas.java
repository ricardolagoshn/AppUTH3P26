package com.uth.apputh3p26.Views;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.uth.apputh3p26.R;
import com.google.android.material.appbar.MaterialToolbar;

public class ActivityPersonas extends AppCompatActivity {

    EditText nombres, apellidos, fechanac, direccion, telefono, correo;
    Button btnagregar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_personas);

        MaterialToolbar toolbar = findViewById(R.id.toolbarPersonas);
        toolbar.setNavigationOnClickListener(v -> finish());

        /* Inicializacion de controles */
        InitControls();
    }

    private void InitControls()
    {
        nombres = (EditText) findViewById(R.id.nombres);
        apellidos = (EditText) findViewById(R.id.apellidos);
        fechanac = (EditText) findViewById(R.id.fechanac);
        direccion = (EditText) findViewById(R.id.direccion);
        telefono  = (EditText) findViewById(R.id.telefono);
        correo = (EditText) findViewById(R.id.correo);
        btnagregar = (Button) findViewById(R.id.btnagregar);
    }
}
