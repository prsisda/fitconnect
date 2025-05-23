package com.training.microservice.booking_service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity			
@Data
public class Course {		 // Tabelle in Datenbank 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	// Primärschlüssel
	
	private String title;
	
	private String description;
	
	private String trainer;
	
}
