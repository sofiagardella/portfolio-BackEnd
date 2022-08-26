package com.portfolio.springboot.repository;

import com.portfolio.springboot.model.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository<Skills, Integer>{
    public Optional<Skills> findByHabilidad(String habilidad);
    public boolean existsByHabilidad(String habilidad);
}