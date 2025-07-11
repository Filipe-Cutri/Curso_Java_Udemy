package com.projetoSpring.ProjetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.ProjetoSpringBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {	
}
