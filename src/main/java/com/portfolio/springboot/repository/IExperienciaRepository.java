package com.portfolio.springboot.repository;

import com.portfolio.springboot.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByPuesto(String puesto);
    public boolean existsByPuesto(String puesto);
}