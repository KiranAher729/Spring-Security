package com.kiranaher;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	//Optional<User> findByUserName(String userName);

	Optional<User> findByUserEmail(String userEmail);
}
