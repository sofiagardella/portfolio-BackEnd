package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Educacion;
import com.portfolio.springboot.repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpEducacionService {
     @Autowired
     IEducacionRepository rEducacion;
     
     public List<Educacion> list(){
         return rEducacion.findAll();
     }
     
     public Optional<Educacion> getOne(int id){
         return rEducacion.findById(id);
     }
     
     public Optional<Educacion> getByCarrera(String carrera){
         return rEducacion.findByCarrera(carrera);
     }
     
     public void save(Educacion expe){
         rEducacion.save(expe);
     }
     
     public void delete(int id){
         rEducacion.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rEducacion.existsById(id);
     }
     
     public boolean existsByCarrera(String carrera){
         return rEducacion.existsByCarrera(carrera);
     }

}