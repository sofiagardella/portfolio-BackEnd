package com.portfolio.springboot.controller;

import com.portfolio.springboot.model.Proyectos;
import com.portfolio.springboot.service.IProyectosService;
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
public class ProyectosController {
    
    @Autowired 
    IProyectosService proyeServ;
    
    
    @GetMapping ("/proyectos/ver")
    @ResponseBody
    public List<Proyectos> verProyectos(){
        return proyeServ.verProyectos();
    }
    
    @PostMapping ("/proyectos/crear")
    public String crearProyectos(@RequestBody Proyectos proyectos){
        proyeServ.saveProyectos(proyectos);
        return "Proyecto creado";
    }
    
    @DeleteMapping ("/proyectos/eliminar/{id}")
    public void eliminarProyectos(@PathVariable Long id){
        proyeServ.eliminarProyectos(id);
    }
    
    @PutMapping ("/proyectos/editar/{id}")
    public Proyectos editarProyectos (@PathVariable Long id,
                                  @RequestParam("nombre") String nuevoNombre,
                                  @RequestParam("año") String nuevoAño,
                                  @RequestParam("about") String nuevoAbout){
        
        Proyectos proyectos = proyeServ.buscarProyectos(id);
        proyectos.setNombre(nuevoNombre);
        proyectos.setAño(nuevoAño);
        proyectos.setAbout(nuevoAbout);
        
        proyeServ.saveProyectos(proyectos);
        return proyectos;
    }   
   
}