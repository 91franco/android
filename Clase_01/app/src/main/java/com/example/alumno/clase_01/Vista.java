package com.example.alumno.clase_01;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 25/08/2016.
 */
public class Vista {
    private Modelo modelo;
    private Button btn1;
    private Button btn2;
    private TextView tv;

    public Vista(Modelo modelo,Activity ac,Controlador controlador){
        this.modelo=modelo;
        this.btn1 = (Button) ac.findViewById(R.id.btnNuevo);
        this.btn1.setOnClickListener(controlador);
        this.btn2=(Button) ac.findViewById(R.id.btnNuevo2);
        this.btn2.setOnClickListener(controlador);
        this.tv=(TextView) ac.findViewById(R.id.tvNombre);
        this.tv.setText(modelo.getContador().toString());
    }

    public void actualizarContador(){
        tv.setText(modelo.getContador().toString());
    }

    public void actualizarBtn1(){
        btn1.setText("Cambio");
    }

    public void actualizarValorOrg(){
        btn1.setText("BOTON 1");
    }
}
