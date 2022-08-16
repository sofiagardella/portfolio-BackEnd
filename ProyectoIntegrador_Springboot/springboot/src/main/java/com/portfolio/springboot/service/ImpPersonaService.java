package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Persona;
import com.portfolio.springboot.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{

    
    @Autowired
    public IPersonaRepository personaRepo;
    
    @Override
        public List<Persona> verPersona() {
        return personaRepo.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);    
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id){
        return personaRepo.findById(id).orElse(null);
    }
    
}
