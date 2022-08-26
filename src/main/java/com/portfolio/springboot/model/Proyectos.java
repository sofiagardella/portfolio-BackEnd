package com.portfolio.springboot.model;


import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank
    private String nombre;
     @NotBlank
    private String fecha;
     @NotBlank
    private String about;
      
      //CONSTRUCTORES

    public Proyectos() {
    }

    public Proyectos(int id, String nombre, String fecha, String about) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.about = about;
    }

    public Proyectos(String nombre, String fecha, String about) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.about = about;
    }
    
    
    
    
    //GETTER Y SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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