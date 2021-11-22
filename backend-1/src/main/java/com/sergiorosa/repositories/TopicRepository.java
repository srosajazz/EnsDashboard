package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Topic;

public interface TopicRepository  extends JpaRepository<Topic, Long>{

}
