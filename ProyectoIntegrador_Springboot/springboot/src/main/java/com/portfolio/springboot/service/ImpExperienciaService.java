package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Experiencia;
import com.portfolio.springboot.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService{

    
    @Autowired
    public IExperienciaRepository experienciaRepo;
    
    @Override
        public List<Experiencia> verExperiencia() {
        return experienciaRepo.findAll();
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        experienciaRepo.save(experiencia);    
    }

    @Override
    public void eliminarExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id){
        return experienciaRepo.findById(id).orElse(null);
    }
    
}
