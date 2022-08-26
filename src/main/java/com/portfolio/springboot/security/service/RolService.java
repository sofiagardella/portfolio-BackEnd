
package com.portfolio.springboot.security.service;

import com.portfolio.springboot.security.entity.Rol;
import com.portfolio.springboot.security.enumeration.RolNombre;
import com.portfolio.springboot.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return iRolRepository.findByRolNombre (rolNombre);
    }
    
    public void save(Rol rol) {
        iRolRepository.save(rol);
    }
}
