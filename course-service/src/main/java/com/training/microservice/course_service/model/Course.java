package com.training.microservice.course_service.model;

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
	private Long id;		// Primärschlüssel
	
	private String title;
	
	private String description;
	
	private String trainer;

	public Course() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
}
