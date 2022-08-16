package com.portfolio.springboot.repository;

import com.portfolio.springboot.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
