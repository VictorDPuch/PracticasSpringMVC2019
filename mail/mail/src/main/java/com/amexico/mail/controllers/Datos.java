/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.mail.controllers;

/**
 *
 * @author victorpuch
 */
class Datos {
    private String correo;
    
    public Datos(){
        
    }
    
    public Datos(String correo){
        this.correo=correo;
    }
    
     public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
