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
        List<Persona> persona = personaRepo.findAll();
        return persona;
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
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }

    @Override
    public Persona getOne(int id) {
        throw new UnsupportedOperationException("error abstracto"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existsById(int id) {
        throw new UnsupportedOperationException("error abstacto"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
