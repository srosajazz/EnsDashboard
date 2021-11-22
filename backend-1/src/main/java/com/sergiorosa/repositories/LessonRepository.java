package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
