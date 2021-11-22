package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
