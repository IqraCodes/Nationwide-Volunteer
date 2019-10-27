package com.nationwide.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nationwide.persistence.domain.volunteer;

public interface volunteerrepository extends JpaRepository<volunteer, Long> {

	

}
