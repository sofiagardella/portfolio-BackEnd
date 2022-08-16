package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    //METODOS SIN IMPLEMENTACION//
    
    //OBTENER PROYECTO//
    public List<Proyectos> verProyectos();
    
    //GUARDAR UN PROYECTO//
    public void saveProyectos (Proyectos usuario);
    
    //ELIMINAR UN PROYECTO//
    public void eliminarProyectos (Long id);
    
    //BUSCAR PROYECTO//
    public Proyectos buscarProyectos (Long id);
    
    
}
