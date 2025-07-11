package com.projetoSpring.ProjetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.ProjetoSpringBoot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {	
}
