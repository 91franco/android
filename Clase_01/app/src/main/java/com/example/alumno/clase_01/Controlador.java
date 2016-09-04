package com.example.alumno.clase_01;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alumno on 18/08/2016.
 */
public class Controlador implements View.OnClickListener {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo){
        this.modelo=modelo;
        this.vista=vista;
    }

    public void setVista(Vista v){
        this.vista=v;
    }

    @Override
    public  void onClick (View v){


        if(v.getId() == R.id.btnNuevo){
            Integer con = modelo.getContador();
            con ++;
            modelo.setContador(con);
            vista.actualizarContador();
            vista.actualizarBtn1();
        }
        if(v.getId() == R.id.btnNuevo2){
            modelo.setContador(0);
            vista.actualizarContador();
            vista.actualizarValorOrg();
        }


    }
}
