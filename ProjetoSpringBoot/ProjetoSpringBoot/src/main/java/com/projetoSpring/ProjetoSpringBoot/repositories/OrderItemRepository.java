package com.projetoSpring.ProjetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.ProjetoSpringBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {	
}
