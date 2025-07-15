package com.projetoSpring.ProjetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.ProjetoSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {	
}
