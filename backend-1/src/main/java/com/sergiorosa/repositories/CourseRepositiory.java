package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Course;

public interface  CourseRepositiory extends JpaRepository<Course, Long>{

}
