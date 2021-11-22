package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
