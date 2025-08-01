package com.training.microservice.user_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.microservice.user_service.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	boolean existsByEmail(String email);
	
	boolean existsByUsername(String username);
	
	Optional<User> findByUsername(String username);
}
