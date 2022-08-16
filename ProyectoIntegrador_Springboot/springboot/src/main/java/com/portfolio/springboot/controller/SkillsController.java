package com.portfolio.springboot.controller;

import com.portfolio.springboot.model.Skills;
import com.portfolio.springboot.service.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController {
    
    @Autowired 
    ISkillsService skillsServ;
    
    
    @GetMapping ("/skills/ver")
    @ResponseBody
    public List<Skills> verSkills(){
        return skillsServ.verSkills();
    }
    
    @PostMapping ("/skills/crear")
    public String crearSkills(@RequestBody Skills skills){
        skillsServ.saveSkills(skills);
        return "Skill creado";
    }
    
    @DeleteMapping ("/skills/eliminar/{id}")
    public void eliminarSkills (@PathVariable Long id){
        skillsServ.eliminarSkills(id);
    }
    
    @PutMapping ("/skills/editar/{id}")
    public Skills editarSkills(@PathVariable Long id,
                                  @RequestParam("habilidad") String nuevoHabilidad,
                                  @RequestParam("avance") String nuevoAvance){
        
        Skills skills = skillsServ.buscarSkills(id);
        skills.setHabilidad(nuevoHabilidad);
        skills.setAvance(nuevoAvance);
        
        skillsServ.saveSkills(skills);
        return skills;
    }   
   
}
