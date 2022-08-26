package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    

    //Ver lista
    public List<Proyectos> getProyectos();
    
    //Guardar proyecto
    public void saveProyectos(Proyectos proyectos);
    
    //Eliminar un proyecto por id
    public void deleteProyectos(Long id);
    
    //Buscar unn proyecto por id
    public Proyectos findProyectos(Long id);

    public boolean existsById(int id);

    public Object getOne(int id);

    public List<Proyectos> list();

    public void delete(int id);

    public boolean existsByNombre(String nombre);

    public void save(Proyectos proyectos);

    public Object getByNombre(String nombre);

  
}