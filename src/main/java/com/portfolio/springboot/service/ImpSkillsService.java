package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Skills;
import com.portfolio.springboot.repository.ISkillsRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpSkillsService {
     @Autowired
     ISkillsRepository rSkills;
     
     public List<Skills> list(){
         return rSkills.findAll();
     }
     
     public Optional<Skills> getOne(int id){
         return rSkills.findById(id);
     }
     
     public Optional<Skills> getByHabilidad(String habilidad){
         return rSkills.findByHabilidad(habilidad);
     }
     
     public void save(Skills expe){
         rSkills.save(expe);
     }
     
     public void delete(int id){
         rSkills.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rSkills.existsById(id);
     }
     
     public boolean existsByHabilidad(String habilidad){
         return rSkills.existsByHabilidad(habilidad);
     }

}