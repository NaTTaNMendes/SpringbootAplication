package com.estudante.Project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudante.Project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
