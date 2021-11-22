package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
