
package com.portfolio.springboot.security.repository;

import com.portfolio.springboot.security.entity.Rol;
import com.portfolio.springboot.security.enumeration.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
