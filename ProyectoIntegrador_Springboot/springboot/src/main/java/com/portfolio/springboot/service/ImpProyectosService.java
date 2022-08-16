package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Proyectos;
import com.portfolio.springboot.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectosService implements IProyectosService{

    
    @Autowired
    public IProyectosRepository proyectosRepo;
    
    @Override
        public List<Proyectos> verProyectos() {
        return proyectosRepo.findAll();
    }

    @Override
    public void saveProyectos(Proyectos proyectos) {
        proyectosRepo.save(proyectos);    
    }

    @Override
    public void eliminarProyectos(Long id) {
        proyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id){
        return proyectosRepo.findById(id).orElse(null);
    }
    
}
