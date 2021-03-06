package com.example.alumno.myapplication;

import android.graphics.Bitmap;
import android.util.Xml;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 13/10/2016.
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String telefono;
    private String urlImg;
    private Bitmap imagen;

    public String getUrlImg() {
        return urlImg;
    }

    public String getApellido() {
        return apellido;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public static List<Persona> obtenerListaPersonaByJason (String jasonPersona) throws IOException,JSONException {
        List<Persona> lista = new ArrayList<>();
        JSONObject jason = new JSONObject(jasonPersona);
        JSONArray personas = jason.getJSONArray("personas");

        for (int i = 0; i < personas.length() ; i++) {
            JSONObject c = personas.getJSONObject(i);
            String nombre = c.getString("name");
            String apellido = c.getString("surname");
            String telefono = c.getString("phone");
            String urlImg = c.getString("img");

            Persona p = new Persona();
            p.setNombre(nombre);
            p.setApellido(apellido);
            p.setUrlImg(urlImg);
            p.setTelefono(telefono);

            lista.add(p);
        }

        return  lista;
    }
}
