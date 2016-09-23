package com.example.alumno.mitp_01;

import android.app.Activity;
import android.widget.Button;

/**
 * Created by alumno on 22/09/2016.
 */
public class Vista {
    private Button btnRegister;

    public Vista(Activity ac,Controlador controlador) {
        this.btnRegister = (Button) ac.findViewById(R.id.btnRegistrarse);
        this.btnRegister.setOnClickListener(controlador);
    }
}
