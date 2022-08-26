package com.portfolio.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String puesto;

    @NotNull
    @Size(min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String empresa;

    @NotNull
    @Size(min = 1, max = 100, message = "mínimo 1 caracter, máximo 100 caracteres")
    private String fecha;

    private String img;

    //CONSTRUCTORES
    public Experiencia() {
    }

    public Experiencia(int id, String puesto, String empresa, String fecha, String img) {
        this.id = id;
        this.puesto = puesto;
        this.empresa = empresa;
        this.fecha = fecha;
        this.img = img;
    }

    //public Experiencia(String puesto, String puesto0) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

    public Experiencia(String puesto, String empresa, String fecha, String img) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.fecha = fecha;
        this.img = img;
        
    }

    //GETTER Y SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
