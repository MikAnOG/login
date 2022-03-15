package com.telcel.login.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telcel.login.model.Persona;
import com.telcel.login.service.PersonaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PersonaController {

	private final PersonaService personaService;
	
	@PostMapping("/persona")
	public void save(@RequestBody Persona persona) {
		personaService.save(persona);
	}
	
	@GetMapping("/personas")
	public List<Persona> findAll() {
		return personaService.findAll();
	}
	
	@GetMapping("/persona/{id}")
	public Persona findById(@PathVariable Integer id) {
		return personaService.finById(id).get();
	}
	
	@DeleteMapping("/persona/{id}")
	public void deleteById(@PathVariable Integer id) {
		personaService.deleteById(id);
	}
	
	@PutMapping("/persona")
	public void update(@RequestBody Persona persona) {
		personaService.save(persona);
	}
}
