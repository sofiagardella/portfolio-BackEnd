package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Skills;
import com.portfolio.springboot.repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkillsService implements ISkillsService{

    
    @Autowired
    public ISkillsRepository skillsRepo;
    
    @Override
        public List<Skills> verSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public void saveSkills(Skills skills) {
        skillsRepo.save(skills);    
    }

    @Override
    public void eliminarSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id){
        return skillsRepo.findById(id).orElse(null);
    }
    
}
