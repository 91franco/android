package com.example.alumno.clase04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> personas = new ArrayList<>();
        personas.add((new Persona ("Nombre1","Apellido1")));
        personas.add((new Persona ("Nombre2","Apellido2")));
        personas.add((new Persona ("Nombre3","Apellido3")));
        personas.add((new Persona("Nombre4", "Apellido4")));
        personas.add((new Persona("Nombre5", "Apellido5")));
        personas.add((new Persona ("Nombre6","Apellido6")));
        personas.add((new Persona ("Nombre7","Apellido7")));
        personas.add((new Persona ("Nombre8","Apellido8")));
        personas.add((new Persona ("Nombre9","Apellido9")));
        personas.add((new Persona("Nombre10", "Apellido10")));

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvPersona);
        MiAdapter miAdapter = new MiAdapter(personas);

        rv.setAdapter(miAdapter);
        RecyclerView.LayoutManager manager= new LinearLayoutManager(this);
        rv.setLayoutManager(manager);
    }
}
