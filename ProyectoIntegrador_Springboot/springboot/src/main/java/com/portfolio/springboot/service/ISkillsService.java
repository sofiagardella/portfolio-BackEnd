package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Skills;
import java.util.List;

public interface ISkillsService {
    
    //METODOS SIN IMPLEMENTACION//
    
    //OBTENER USUARIO//
    public List<Skills> verSkills();
    
    //GUARDAR UN USUARIO//
    public void saveSkills (Skills usuario);
    
    //ELIMINAR UN USUARIO//
    public void eliminarSkills (Long id);
    
    //BUSCAR PERSONA//
    public Skills buscarSkills (Long id);
    
    
}
