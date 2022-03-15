package com.telcel.login.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(value = "personas")
@Data
public class Persona {
	
	@Id
	private Integer id;
	private String nombre;
	private String apellido;
	private String password;

}
