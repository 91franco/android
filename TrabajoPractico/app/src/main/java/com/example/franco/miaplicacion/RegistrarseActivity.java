package com.example.franco.miaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegistrarseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        Controlador controlador = new Controlador();
        Vista vista = new Vista(this,controlador);

        controlador.setVista(vista);
    }
}
