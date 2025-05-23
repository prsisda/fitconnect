package com.training.microservice.course_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.microservice.course_service.model.Course;
import com.training.microservice.course_service.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository repository;
	
	public List<Course> alleKurse() {
		return repository.findAll();
	}
	
	public Optional<Course> findeNachId(String kursId) {
		return repository.findById(Long.valueOf(kursId));
	}
	
	public Course speichern(Course kurs) {
		return repository.save(kurs);
	}	
	
	public void loeschen(String kursId) {
		repository.deleteById(Long.valueOf(kursId));
	}
	
	/*
	public void aktualisieren(Long id, Benutzer neuerBenutzer) {
		
	}*/
	
}
