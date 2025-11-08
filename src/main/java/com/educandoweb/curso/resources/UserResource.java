package com.educandoweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.User;

@RestController //controlador
@RequestMapping(value = "/users") //coloca o nome
public class UserResource {
   
	@GetMapping //responde a requisicao
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gamil.com", "99999999", "0000");
		return ResponseEntity.ok().body(u);
	}
}
