package com.portfolio.springboot.controller;

import com.portfolio.springboot.model.Usuario;
import com.portfolio.springboot.service.IUsuarioService;
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
public class UsuarioController {
    
    @Autowired 
    IUsuarioService usuServ;
    
    
    @GetMapping ("/usuarios/ver")
    @ResponseBody
    public List<Usuario> verUsuario(){
        return usuServ.verUsuario();
    }
    
    @PostMapping ("/usuario/crear")
    public String crearUsuario (@RequestBody Usuario usuario){
        usuServ.saveUsuario(usuario);
        return "Usuario creado";
    }
    
    @DeleteMapping ("/usuario/eliminar/{id}")
    public void eliminarUsuario (@PathVariable Long id){
        usuServ.eliminarUsuario(id);
    }
    
    @PutMapping ("/usuario/editar/{id}")
    public Usuario editarUsuario (@PathVariable Long id,
                                  @RequestParam("nombre") String nuevoNombre,
                                  @RequestParam("apellido") String nuevoApellido,
                                  @RequestParam("puesto") String nuevoPuesto,
                                  @RequestParam("provincia") String nuevoProvincia,
                                  @RequestParam("pais") String nuevoPais,
                                  @RequestParam("img") String nuevoImg){
        
        Usuario usuario = usuServ.buscarUsuario(id);
        usuario.setNombre(nuevoNombre);
        usuario.setApellido(nuevoApellido);
        usuario.setPuesto(nuevoPuesto);
        usuario.setProvincia(nuevoProvincia);
        usuario.setPais(nuevoPais);
        
        usuServ.saveUsuario(usuario);
        return usuario;
    }   
   
}
