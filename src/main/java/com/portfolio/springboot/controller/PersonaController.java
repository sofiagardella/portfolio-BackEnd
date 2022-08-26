package com.portfolio.springboot.controller;

import com.portfolio.springboot.model.Persona;
import com.portfolio.springboot.security.controller.Mensaje;
import com.portfolio.springboot.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired 
    IPersonaService persServ;
    
    
    @GetMapping ("/personas/ver")
    @ResponseBody
    public List<Persona> verPersona(){
        return persServ.verPersona();
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") int id){
        if(!persServ.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Persona persona = persServ.getOne(id).get();
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    
    @PostMapping ("/persona/crear")
    public String crearPersona(@RequestBody Persona persona){
        persServ.savePersona(persona);
        return "Persona creada";
    }
    
    
    @DeleteMapping ("/persona/eliminar/{id}")
    public void eliminarPersona (@PathVariable Long id){
        persServ.eliminarPersona(id);
    }
    
    
    @PutMapping ("/persona/editar/{id}")
    public Persona editarPersona (@PathVariable Long id,
                                  @RequestParam("nombre") String nuevoNombre,
                                  @RequestParam("apellido") String nuevoApellido,
                                  @RequestParam("puesto") String nuevoPuesto,
                                  @RequestParam("provincia") String nuevoProvincia,
                                  @RequestParam("pais") String nuevoPais,
                                  @RequestParam("img") String nuevoImg){
        
        Persona persona = persServ.buscarPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setPuesto(nuevoPuesto);
        persona.setProvincia(nuevoProvincia);
        persona.setPais(nuevoPais);
        persona.setImg(nuevoImg);
        
        persServ.savePersona(persona);
        return persona;
    }   
    
   @GetMapping("personas/ver/perfil")
    public Persona buscarPersona(){
        return persServ.buscarPersona((long)1);
    }
   
}
