/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.chooseyourpokemon.models;

/**
 *
 * @author victorpuch
 */
public class Seleccionado {
    private String id;
    private String eleccion;
    private String entrenador;
    
    public Seleccionado(){}
    
    public Seleccionado(String id,String eleccion, String entrenador){
        this.id = id;
        this.eleccion = eleccion;
        this.entrenador=entrenador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }
    
     public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
    
}
