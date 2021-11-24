package com.sergiorosa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sergiorosa.dto.NotificationDTO;
import com.sergiorosa.entities.Notification;
import com.sergiorosa.entities.User;
import com.sergiorosa.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService  authService;
	

	public Page<NotificationDTO> notificationForCurrentUser(boolean unreadOnly,Pageable  pageable) {
		User user = authService.authenticated();
		Page<Notification> page = repository.find(user, unreadOnly, pageable);
		
		return page.map(x -> new NotificationDTO(x));
	
	}
}

