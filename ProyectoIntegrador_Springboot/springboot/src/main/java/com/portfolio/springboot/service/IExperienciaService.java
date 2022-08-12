package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    //METODOS SIN IMPLEMENTACION//
    
    //OBTENER EXPERIENCIA//
    public List<Experiencia> verExperiencia();
    
    //GUARDAR UNA EXPERIENCIA//
    public void saveExperiencia (Experiencia experiencia);
    
    //ELIMINAR UNA EXPERIENCIA//
    public void eliminarExperiencia (Long id);
    
    //BUSCAR EXPERIENCIA//
    public Experiencia buscarExperiencia (Long id);
    
    
}
