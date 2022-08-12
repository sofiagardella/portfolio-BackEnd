package com.portfolio.springboot.repository;

import com.portfolio.springboot.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Long>{
    
}
