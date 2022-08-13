package com.portfolio.springboot.controller;

import com.portfolio.springboot.model.Educacion;
import com.portfolio.springboot.service.IEducacionService;
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
public class EducacionController {
    
    @Autowired 
    IEducacionService eduServ;
    
    
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    @PostMapping ("/educacion/crear")
    public String crearEducacion (@RequestBody Educacion educacion){
        eduServ.saveEducacion(educacion);
        return "Educacion creada";
    }
    
    @DeleteMapping ("/educacion/eliminar/{id}")
    public void eliminarEducacion (@PathVariable Long id){
        eduServ.eliminarEducacion(id);
    }
    
    @PutMapping ("/educacion/editar/{id}")
    public Educacion editarEducacion (@PathVariable Long id,
                                  @RequestParam("carrera") String nuevoCarrera,
                                  @RequestParam("institucion") String nuevoInstitucion,
                                  @RequestParam("inicio") String nuevoInicio,
                                  @RequestParam("fin") String nuevoFin,
                                  @RequestParam("img") String nuevoImg){
        
        Educacion educacion = eduServ.buscarEducacion(id);
        educacion.setCarrera(nuevoCarrera);
        educacion.setInstitucion(nuevoInstitucion);
        educacion.setInicio(nuevoInicio);
        educacion.setFin(nuevoFin);
        educacion.setImg(nuevoImg);
        
        eduServ.saveEducacion(educacion);
        return educacion;
    }   
   
}