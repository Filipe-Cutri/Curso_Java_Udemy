package com.projetoSpring.ProjetoSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.ProjetoSpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
}
