package com.sergiorosa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sergiorosa.entities.Enrollment;
import com.sergiorosa.entities.pk.EnrollmentPK;

public  interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
