package com.telcel.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telcel.login.model.Persona;

public interface PersonaRepository extends MongoRepository<Persona, Integer>{

}
