package com.portfolio.springboot.dto;

import javax.validation.constraints.NotBlank;


public class DtoSkills {
    
    @NotBlank
    private String habilidad;

    @NotBlank
    private int avance;
    
    //CONTRUCTORES

    public DtoSkills() {
    }

    public DtoSkills(String habilidad, int avance) {
        this.habilidad = habilidad;
        this.avance = avance;
    }
    //GETTER Y SETTER

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }
    
}

