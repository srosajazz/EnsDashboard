package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
