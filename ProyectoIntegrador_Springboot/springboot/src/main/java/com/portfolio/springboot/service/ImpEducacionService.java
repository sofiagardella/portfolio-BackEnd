package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Educacion;
import com.portfolio.springboot.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService{

    
    @Autowired
    public IEducacionRepository educacionRepo;
    
    @Override
        public List<Educacion> verEducacion() {
        return educacionRepo.findAll();
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepo.save(educacion);    
    }

    @Override
    public void eliminarEducacion(Long id) {
        educacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id){
        return educacionRepo.findById(id).orElse(null);
    }
    
}