
package com.portfolio.springboot.security.controller;

public class Mensaje {
    private String mensaje;
    
    
    //CONSTRUCTORES

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    //GETTER Y SETTER

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}
