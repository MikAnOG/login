package com.telcel.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.telcel.login.model.Persona;
import com.telcel.login.repository.PersonaRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class PersonaService {
	
	private final PersonaRepository personaRepository;
	
	public void save(Persona persona) {
		personaRepository.save(persona);
	}
	
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}
	
	public Optional<Persona> finById(Integer id) {
		return personaRepository.findById(id);
	}
	
	public void deleteById(Integer id) {
		personaRepository.deleteById(id);
	}

}
