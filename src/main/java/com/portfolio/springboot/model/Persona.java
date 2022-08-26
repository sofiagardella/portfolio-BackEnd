package com.portfolio.springboot.model;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size (min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String nombre;
    
    @NotNull
    @Size (min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String apellido;
    
    @NotNull
    @Size (min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String puesto;
    
    @NotNull
    @Size (min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String provincia;
    
    @NotNull
    @Size (min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String pais;
    
    
    private String img;

    //CONSTRUCTORES

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String puesto, String provincia, String pais, String img) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.provincia = provincia;
        this.pais = pais;
        this.img = img;
    }

    public Persona get() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}