package com.estudante.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.Project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
