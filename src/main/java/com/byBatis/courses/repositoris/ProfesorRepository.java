package com.byBatis.courses.repositoris;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byBatis.courses.entities.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long>{

	
}
