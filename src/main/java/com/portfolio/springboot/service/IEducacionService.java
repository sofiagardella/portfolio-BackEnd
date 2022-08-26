package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    //METODOS SIN IMPLEMENTACION//
    
    //OBTENER EDUCACION//
    public List<Educacion> verEducacion();
    
    //GUARDAR UN EDUCACION//
    public void saveEducacion (Educacion educacion);
    
    //ELIMINAR UN EDUCACION//
    public void eliminarEducacion (Long id);
    
    //BUSCAR EDUCACION//
    public Educacion buscarEducacion (Long id);
    
    
}
