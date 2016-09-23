package com.example.alumno.mitp_01;

import android.content.Intent;
import android.util.Log;
import android.view.View;

/**
 * Created by alumno on 22/09/2016.
 */
public class Controlador implements View.OnClickListener {
    private Vista vista;

    public Controlador( ){
       this.vista=vista;
    }

    public void setVista(Vista v){
        this.vista=v;
    }
    @Override
    public  void onClick (View v) {
        if(v.getId()==R.id.btnRegistrarse){
            Log.d("Se hizo click", "Click en el elemento");

        }
    }
}
