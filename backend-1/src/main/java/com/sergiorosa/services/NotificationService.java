package com.sergiorosa.services;

import java.time.Instant;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sergiorosa.dto.NotificationDTO;
import com.sergiorosa.entities.Deliver;
import com.sergiorosa.entities.Notification;
import com.sergiorosa.entities.User;
import com.sergiorosa.observers.DeliverRevisionObserver;
import com.sergiorosa.repositories.NotificationRepository;

@Service
public class NotificationService  implements DeliverRevisionObserver{

	@Autowired
	private NotificationRepository repository;
	
	@Autowired
	private AuthService  authService;
	
	@Autowired
	private DeliverService deliverService;
	
	@PostConstruct
	private void Initialize() {
		deliverService.subscribeDeliverRevisionObserver(this);
	}
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationForCurrentUser(boolean unreadOnly,Pageable  pageable) {
		User user = authService.authenticated();
		Page<Notification> page = repository.find(user, unreadOnly, pageable);
		
		return page.map(x -> new NotificationDTO(x));
	
	}
	
	@Transactional
	public void saveDeliverNotification(Deliver deliver) {
		Long sectionId = deliver.getLesson().getSection().getId();
		Long resourceId = deliver.getLesson().getSection().getId();
		Long offerId = deliver.getLesson().getSection().getResource().getId();
		
		String route = "/offer/" + offerId + "/resources/" + resourceId + "/sections/"+ sectionId;
		String text = deliver.getFeedback();
		Instant moment = Instant.now();
		User user = deliver.getEnrollment().getStudent();
		
		Notification notification = new Notification(null, text, moment, false, route, user);
		repository.save(notification);
	}

	@Override
	public void onSaveRevision(Deliver deliver) {
		saveDeliverNotification(deliver);
		
	}
}













