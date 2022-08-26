package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Skills;
import java.util.List;


public interface ISkillsService {
    

    //Ver lista
    public List<Skills> getSkills();
    
    //Guardar skill
    public void saveSkills(Skills skills);
    
    //Eliminar una skills por id
    public void deleteSkills(Long id);
    
    //Buscar una skill por id
    public Skills findSkills(Long id);

    public boolean existsById(int id);

    public Object getOne(int id);

    public List<Skills> list();

    public void delete(int id);

    public boolean existsByPuesto(String nombre);

    public void save(Skills skills);

    public Object getByNombre(String nombre);

  
}