package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    

    //Ver lista
    public List<Experiencia> getExperiencia();
    
    //Guardar experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar una experiencia por id
    public void deleteExperiencia(Long id);
    
    //Buscar una experiencia por id
    public Experiencia findExperiencia(Long id);

    public boolean existsById(int id);

    public Object getOne(int id);

    public List<Experiencia> list();

    public void delete(int id);

    public boolean existsByPuesto(String puesto);

    public void save(Experiencia experiencia);

    public Object getByPuesto(String puesto);

  
}
    

