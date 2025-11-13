package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	//conecta o User a o repositorio Jpa

}
