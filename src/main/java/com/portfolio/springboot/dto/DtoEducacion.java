
package com.portfolio.springboot.dto;

import javax.validation.constraints.NotBlank;


public class DtoEducacion {
    
    @NotBlank
    private String carrera;
    
    @NotBlank
    private String institucion;
    
    @NotBlank
    private String fecha;
    
    private String img;
    
    //CONSTRUCTORES

    public DtoEducacion() {
    }

    public DtoEducacion(String carrera, String institucion, String fecha, String img) {
        this.carrera = carrera;
        this.institucion = institucion;
        this.fecha = fecha;
        this.img = img;
    }
    
    //GETTER Y SETTER

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCarerra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}

