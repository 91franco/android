package com.example.alumno.myapplication;

import android.graphics.Bitmap;
import android.util.Xml;

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

    public static List<Persona> obtenerListaPersonaByXml (String xmlPersona) throws XmlPullParserException,IOException {
        List<Persona> lista = new ArrayList<>();

        XmlPullParser parser = Xml.newPullParser();
        parser.setInput(new StringReader(xmlPersona));
        int event = parser.getEventType();

        while (event != XmlPullParser.END_DOCUMENT){
            switch (event){
                case XmlPullParser.START_TAG:
                    String tag = parser.getName();

                    if ("persona".equals(tag)){
                        String nombre = parser.getAttributeValue(null,"name");
                        String apellido = parser.getAttributeValue(null,"surname");
                        String urlImg = parser.getAttributeValue(null,"img");
                        String telefono = parser.nextText();
                        Persona p = new Persona();
                        p.setNombre(nombre);
                        p.setApellido(apellido);
                        p.setUrlImg(urlImg);
                        p.setTelefono(telefono);

                        lista.add(p);
                    }
                    break;
            }
            event = parser.next();
        }

        return  lista;
    }
}
