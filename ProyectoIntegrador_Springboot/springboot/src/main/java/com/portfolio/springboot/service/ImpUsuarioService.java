package com.portfolio.springboot.service;

import com.portfolio.springboot.model.Usuario;
import com.portfolio.springboot.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpUsuarioService implements IUsuarioService{

    
    @Autowired
    public IUsuarioRepository usuarioRepo;
    
    @Override
        public List<Usuario> verUsuario() {
        return usuarioRepo.findAll();
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);    
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario buscarUsuario(Long id){
        return usuarioRepo.findById(id).orElse(null);
    }
    
}
