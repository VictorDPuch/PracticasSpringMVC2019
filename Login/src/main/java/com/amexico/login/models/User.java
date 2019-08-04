/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amexico.login.models;

/**
 *
 * @author victorpuch
 */
public class User {
    private String id;
    private String user;
    private String pass;

    public User(){}
    
    public User(String id, String user, String pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
}
