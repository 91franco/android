package com.example.alumno.clase04;

/**
 * Created by alumno on 08/09/2016.
 */
public class Persona {
    private String nombre;
    private String apellido;

    public Persona (String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public String getNombre (){
        return this.nombre;
    }

    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public String getApellido (){
        return this.apellido;
    }

    public void setApellido (String apellido){
        this.apellido=apellido;
    }
}
