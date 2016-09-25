package com.example.franco.miaplicacion;

import android.util.Log;
import android.view.View;

/**
 * Created by Franco on 24/09/2016.
 */
public class Controlador implements View.OnClickListener {
    private Vista vista;

    public Controlador (){

    }

    public void setVista(Vista v){
        this.vista=v;
    }

    @Override
    public void onClick(View v){

        if (v.getId()==R.id.btnIngresar){
            Log.d("Se hizo clic","clic");
        }

        if (v.getId()==R.id.btnRegistrarse){
            Log.d("Se hizo clic","clic");
            vista.iniciarRegistro();
        }
        if(v.getId()==R.id.btnReRegistrarse){
            Log.d("Se hizo clic","clic");
            vista.datosRegistro();
        }

        if(v.getId()==R.id.btnAgregar){
            Log.d("Se hizo clic","clic");
            vista.crearCategoria();
        }

    }

}
