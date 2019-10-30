package com.nationwide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nationwide.domain.Volunteer;


@Repository
public interface volunteerrepository extends JpaRepository<Volunteer, Long> {

}
