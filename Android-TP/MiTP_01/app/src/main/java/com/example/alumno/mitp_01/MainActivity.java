package com.example.alumno.mitp_01;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Controlador controlador = new Controlador();
        Vista vista = new Vista (this,controlador);
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
        controlador.setVista(vista);

    }
}
