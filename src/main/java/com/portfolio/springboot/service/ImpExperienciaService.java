package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Experiencia;
import com.portfolio.springboot.repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienciaService {
     @Autowired
     IExperienciaRepository rExperiencia;
     
     public List<Experiencia> list(){
         return rExperiencia.findAll();
     }
     
     public Optional<Experiencia> getOne(int id){
         return rExperiencia.findById(id);
     }
     
     public Optional<Experiencia> getByPuesto(String puesto){
         return rExperiencia.findByPuesto(puesto);
     }
     
     public void save(Experiencia expe){
         rExperiencia.save(expe);
     }
     
     public void delete(int id){
         rExperiencia.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByPuesto(String puesto){
         return rExperiencia.existsByPuesto(puesto);
     }

}