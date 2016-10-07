package com.example.alumno.myapplication;

import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by alumno on 06/10/2016.
 */
public class Conexion  {

    public byte [] obtenerInfroamcion (String urlString) throws IOException{
        URL url = new URL(urlString);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.connect();
        int response = urlConnection.getResponseCode();
        Log.d("Http", "Response code: " + response);
        if(response==200){
            InputStream is = urlConnection.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte [] buffer = new byte[1024];
            int length = 0;
            while ((length = is.read(buffer)) != -1){
                baos.write(buffer,0,length);
            }
            is.close();
            return baos.toByteArray();
        }
        else
            throw new IOException();
    }


}
