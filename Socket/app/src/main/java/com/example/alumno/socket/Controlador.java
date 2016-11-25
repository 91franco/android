package com.example.alumno.socket;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.MalformedInputException;

/**
 * Created by alumno on 24/11/2016.
 */
public class Controlador implements View.OnClickListener, Handler.Callback  {
    private String mensaje;
    private Handler h;
    private MiHilo hilo;
    private EditText editText;
    private TextView textView;

    public Controlador (EditText editText,TextView textView){
        Handler.Callback callback = this;
        h = new Handler(callback);
        hilo = new MiHilo(h);
        hilo.start();

        this.editText=editText;
        this.textView=textView;
    }

    @Override
    public void onClick(View v) {
        Log.d("Click", "Se hizo Click");
        mensaje=editText.getText().toString();
        Log.d("mensaje",mensaje);
        hilo.sendMsg(mensaje);

    }

    public boolean handleMessage(Message msg) {
        textView.setText(textView.getText().toString() +"\n"+msg.obj.toString());

        return false;
    }
}
