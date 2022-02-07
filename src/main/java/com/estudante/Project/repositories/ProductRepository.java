package com.estudante.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.Project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
