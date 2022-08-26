package com.portfolio.springboot.dto;

import javax.validation.constraints.NotBlank;


public class DtoProyectos {
    
    @NotBlank
    private String nombre;

    @NotBlank
    private String fecha;

    @NotBlank
    private String about;

    
    //CONSTRUCTORES

    public DtoProyectos() {
    }

    public DtoProyectos(String nombre, String fecha, String about) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.about = about;
    }

  

    //GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
}
  
    