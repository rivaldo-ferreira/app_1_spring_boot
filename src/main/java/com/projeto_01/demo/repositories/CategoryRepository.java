package com.projeto_01.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_01.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
