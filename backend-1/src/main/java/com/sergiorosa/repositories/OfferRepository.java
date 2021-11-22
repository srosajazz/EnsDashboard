package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Offer;


public interface OfferRepository extends JpaRepository<Offer, Long> {

}
