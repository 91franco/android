package com.example.alumno.mitp_01;

/**
 * Created by alumno on 22/09/2016.
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String clave;

    public Usuario (String nombre,String apellido, String usuario,String clave){
        this.nombre=nombre;
        this.apellido=apellido;
        this.usuario=usuario;
        this.clave=clave;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getUsuario(){
        return this.usuario;
    }

    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getClave(){
        return this.clave;
    }

    public void setClave(String clave){
        this.clave=clave;
    }

}
