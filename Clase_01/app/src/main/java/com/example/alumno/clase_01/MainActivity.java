package com.example.alumno.clase_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo);
        Vista vista = new Vista (modelo,this,controlador);

        controlador.setVista(vista);
    }
}
