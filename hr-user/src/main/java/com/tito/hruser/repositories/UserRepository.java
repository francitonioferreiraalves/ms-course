package com.tito.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
