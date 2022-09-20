package com.revature.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

	Optional<Login> findByUsernameAndPassword(String username, String password);
}
