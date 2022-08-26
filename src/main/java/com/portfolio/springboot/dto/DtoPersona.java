
package com.portfolio.springboot.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class DtoPersona {
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

    public DtoPersona() {
    }

    public DtoPersona(String nombre, String apellido, String puesto, String provincia, String pais, String img) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.provincia = provincia;
        this.pais = pais;
        this.img = img;
    }
    
}
