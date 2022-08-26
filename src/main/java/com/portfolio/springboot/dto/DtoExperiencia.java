
package com.portfolio.springboot.dto;

import javax.validation.constraints.NotBlank;


public class DtoExperiencia {
    
    @NotBlank
    private String puesto;

    @NotBlank
    private String empresa;

    @NotBlank
    private String fecha;

    private String img;
    
    //CONSTRUCTORES

    public DtoExperiencia() {
    }

    public DtoExperiencia(String puesto, String empresa, String fecha, String img) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.fecha = fecha;
        this.img = img;
    }

    //GETTER Y SETTER

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
    
    
}
