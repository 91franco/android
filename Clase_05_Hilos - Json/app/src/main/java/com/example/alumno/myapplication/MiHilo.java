package com.example.alumno.myapplication;

import android.os.Handler;
import android.os.Message;
import android.util.Xml;
import android.widget.TextView;

import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

/**
 * Created by alumno on 06/10/2016.
 */
public class MiHilo extends Thread {
    Handler miHandler;
    Conexion miConexion;
    int accion;
    int event;
    public MiHilo(Handler handler, int i){
        miHandler=handler;
        accion=i;

    }

    @Override
    public void run (){

        try {
            Thread.sleep(2000L);
            miConexion= new Conexion();
            byte[] informacion=miConexion.obtenerInfroamcion("http://192.168.2.36:8080/personas.json");
            //byte[] informacion2=miConexion.obtenerInfroamcion("http://cnt.winkal.com/514ac83de4b096b75cb86264/XWNs_700.jpg");
            byte[] informacion2=miConexion.obtenerInfroamcion("http://www.lslutnfra.com/alumnos/practicas/pedro_pic.jpg");
            String s = new  String(informacion,"UTF-8");

            List<Persona> personas = Persona.obtenerListaPersonaByJason(s);



            if(accion==1) {
                Message msg = new Message();
                msg.arg1 = MainActivity.MENSAJE;
                msg.obj = personas;
                miHandler.sendMessage(msg);
            }

            if(accion==2){
                Message msg1= new Message();
                msg1.arg1=MainActivity.IMAGEN;
                msg1.obj=informacion2;
                miHandler.sendMessage(msg1);
            }
            //miView.setText("Ingresando al hilo");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (IOException e1) {
        e1.printStackTrace();
        }catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
