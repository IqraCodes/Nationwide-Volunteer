package com.nationwide.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nationwide.persistence.repository.volunteerrepository;

@RestController
public class volunteercontroller {

	volunteerrepository repository = new volunteerrepository();
	


	
}