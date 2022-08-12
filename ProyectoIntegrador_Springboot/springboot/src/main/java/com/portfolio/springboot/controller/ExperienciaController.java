package com.portfolio.springboot.controller;

import com.portfolio.springboot.model.Experiencia;
import com.portfolio.springboot.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired 
    IExperienciaService expServ;
    
    
    @GetMapping ("/experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expServ.verExperiencia();
    }
    
    @PostMapping ("/experiencia/crear")
    public String crearExperiencia(@RequestBody Experiencia experiencia){
        expServ.saveExperiencia(experiencia);
        return "Experiencia creada";
    }
    
    @DeleteMapping ("/experiencia/eliminar/{id}")
    public void eliminarExperiencia (@PathVariable Long id){
        expServ.eliminarExperiencia(id);
    }
    
    @PutMapping ("/experiencia/editar/{id}")
    public Experiencia editarUsuario (@PathVariable Long id,
                                  @RequestParam("puesto") String nuevoPuesto,
                                  @RequestParam("empresa") String nuevoEmpresa,
                                  @RequestParam("inicio") String nuevoInicio,
                                  @RequestParam("fin") String nuevoFin,
                                  @RequestParam("img") String nuevoImg){
        
        Experiencia experiencia = expServ.buscarExperiencia (id);
        experiencia.setPuesto(nuevoPuesto);
        experiencia.setEmpresa(nuevoEmpresa);
        experiencia.setInicio(nuevoInicio);
        experiencia.setFin(nuevoFin);
        experiencia.setImg(nuevoImg);
        
        expServ.saveExperiencia(experiencia);
        return experiencia;
    }   
   
}
