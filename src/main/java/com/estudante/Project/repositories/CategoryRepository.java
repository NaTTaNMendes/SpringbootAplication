package com.estudante.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.Project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
