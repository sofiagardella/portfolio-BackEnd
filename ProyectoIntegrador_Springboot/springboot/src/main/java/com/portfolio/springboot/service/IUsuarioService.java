package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
    //METODOS SIN IMPLEMENTACION//
    
    //OBTENER USUARIO//
    public List<Usuario> verUsuario();
    
    //GUARDAR UN USUARIO//
    public void saveUsuario (Usuario usuario);
    
    //ELIMINAR UN USUARIO//
    public void eliminarUsuario (Long id);
    
    //BUSCAR PERSONA//
    public Usuario buscarUsuario (Long id);
    
    
}
