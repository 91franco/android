package com.example.alumno.myapplication;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

/**
 * Created by alumno on 06/10/2016.
 */
public class MiHilo extends Thread {
    Handler miHandler;

    public MiHilo(Handler handler){
        miHandler=handler;
    }

    @Override
    public void run (){

        try {
            Thread.sleep(2000L);

        Message msg = new Message();
        msg.arg1 = MainActivity.MENSAJE;
        msg.obj="Ingresando al hilo";
        miHandler.sendMessage(msg);
        //miView.setText("Ingresando al hilo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
