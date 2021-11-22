package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
