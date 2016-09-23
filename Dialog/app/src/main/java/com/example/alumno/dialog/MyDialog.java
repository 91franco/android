package com.example.alumno.dialog;

import android.app.Dialog;
import android.os.Bundle;

import android.support.v7.app.AlertDialog;


/**
 * Created by alumno on 22/09/2016.
 */
public class MyDialog extends android.support.v4.app.DialogFragment {
    @Override
    public Dialog onCreateDialog( Bundle bundle){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Titulo ");
        builder.setMessage("Mensaje");
        MyListener a = new MyListener();
        builder.setPositiveButton("Rechazar", a);
        AlertDialog ad = builder.create();

        return ad;
    }


}
