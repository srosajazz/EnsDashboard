package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
