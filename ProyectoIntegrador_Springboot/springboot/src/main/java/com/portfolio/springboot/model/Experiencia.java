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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size (min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String puesto;
    private String empresa;
    private String inicio;
    private String fin;
    private String img;
}