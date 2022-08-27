package com.portfolio.springboot.repository;

import com.portfolio.springboot.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByCarrera(String carrera);
    public boolean existsByCarrera(String carrera);
}