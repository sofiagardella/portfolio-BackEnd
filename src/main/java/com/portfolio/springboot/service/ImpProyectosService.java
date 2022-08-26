package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Proyectos;
import com.portfolio.springboot.repository.IProyectosRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpProyectosService {
     @Autowired
     IProyectosRepository rProyectos;
     
     public List<Proyectos> list(){
         return rProyectos.findAll();
     }
     
     public Optional<Proyectos> getOne(int id){
         return rProyectos.findById(id);
     }
     
     public Optional<Proyectos> getByNombre(String nombre){
         return rProyectos.findByNombre(nombre);
     }
     
     public void save(Proyectos proye){
         rProyectos.save(proye);
     }
     
     public void delete(int id){
         rProyectos.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyectos.existsById(id);
     }
     
     public boolean existsByNombre(String nombre){
         return rProyectos.existsByNombre(nombre);
     }

}