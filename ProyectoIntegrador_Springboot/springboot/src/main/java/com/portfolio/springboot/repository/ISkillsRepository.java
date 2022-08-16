package com.portfolio.springboot.repository;

import com.portfolio.springboot.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository <Skills, Long>{
    
}
