package com.example.alumno.socket;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    private FloatingActionButton btnAgregar;
    private Controlador controlador;
    private EditText mensaje;
    private TextView textView;
    private Handler h;
    private MiHilo hilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mensaje=(EditText) findViewById(R.id.ingresoMensaje);
        this.textView=(TextView) findViewById(R.id.txtMensaje);

        this.btnAgregar = (FloatingActionButton) findViewById(R.id.btnAgregar);
        controlador=new Controlador(mensaje,textView);
        this.btnAgregar.setOnClickListener(controlador);


    }
}
