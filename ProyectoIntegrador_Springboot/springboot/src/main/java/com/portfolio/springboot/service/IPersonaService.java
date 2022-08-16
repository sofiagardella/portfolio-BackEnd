package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //METODOS SIN IMPLEMENTACION//
    
    //OBTENER PERSONA//
    public List<Persona> verPersona();
    
    //GUARDAR UNA PERSONA//
    public void savePersona (Persona persona);
    
    //ELIMINAR UNA PERSONA//
    public void eliminarPersona (Long id);
    
    //BUSCAR PERSONA//
    public Persona buscarPersona (Long id);
    
    
}
