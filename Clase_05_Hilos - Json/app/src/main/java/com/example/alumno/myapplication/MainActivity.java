package com.example.alumno.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Xml;
import android.widget.ImageView;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Handler.Callback{
    MiHilo hilo;
    MiHilo hilo2;
    TextView textView;
    ImageView imageView;


    public static  final int MENSAJE=1;
    public static  final int IMAGEN=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler.Callback callback = this;
        Handler handler = new Handler(callback);
        imageView = (ImageView) this.findViewById(R.id.imageView);
        textView = (TextView) this.findViewById(R.id.txLabel);
        hilo = new MiHilo(handler,1);
        hilo.start();

        hilo2 = new MiHilo(handler,2);
        hilo2.start();


    }

    @Override
    protected void onStop(){
        super.onStop();

        hilo.interrupt();
    }

    @Override
    public boolean handleMessage(Message msg) {
        if(msg.arg1==MENSAJE){
            List<Persona> lista = (List<Persona>) msg.obj;
            textView.setText(lista.get(1).getNombre().toString()+" " + lista.get(1).getApellido().toString()+" "
                             + lista.get(1).getTelefono().toString());

        }
        if(msg.arg1==IMAGEN){
            byte [] img = (byte[]) msg.obj;
            Bitmap bitmap = BitmapFactory.decodeByteArray(img,0,img.length);
            imageView.setImageBitmap(bitmap);
        }
        //else{
          //  textView.setText("No ingreso");
        //}
        return false;
    }
}

