/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.multirow.models;

/**
 *
 * @author victorpuch
 */
public class Articulo {
    
    String id;
    String nombre;
    String cantidad;
    String changes;

    public Articulo() {
    }

    public Articulo(String id, String nombre, String cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }    

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }
    
}
