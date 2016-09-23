package com.example.alumno.dialog;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;

/**
 * Created by alumno on 22/09/2016.
 */
public class MyListener implements OnClickListener {
    @Override
    public void onClick(DialogInterface dialog,int which){
        Log.d("click", "se hizo click");

    }
}
