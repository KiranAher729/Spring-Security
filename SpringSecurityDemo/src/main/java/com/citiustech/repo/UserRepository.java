package com.citiustech.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citiustech.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUserEmail(String email);
	Optional<User> findByRole(String role);
	boolean existsByUserEmail(String email);

}
