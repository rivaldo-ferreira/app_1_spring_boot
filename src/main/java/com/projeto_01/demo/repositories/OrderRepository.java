package com.projeto_01.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_01.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
