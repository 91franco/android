package com.example.alumno.myapplication;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Handler.Callback{
    MiHilo hilo;
    TextView textView;
    public static  final int MENSAJE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler.Callback callback = this;
        Handler handler = new Handler(callback);

        textView = (TextView) this.findViewById(R.id.txLabel);
        hilo = new MiHilo(handler);
        hilo.start();


    }

    @Override
    protected void onStop(){
        super.onStop();

        hilo.interrupt();
    }

    @Override
    public boolean handleMessage(Message msg) {
        if(msg.arg1==MENSAJE){
            textView.setText(msg.obj.toString());
        }
        else{
            textView.setText("No ingreso");
        }
        return false;
    }
}

