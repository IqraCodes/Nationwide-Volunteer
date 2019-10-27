package com.nationwide.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nationwide.business.volunteerService;
import com.nationwide.persistence.domain.volunteer;

@RestController
public class volunteercontroller {
    
	@Autowired
	private volunteerService volunteerService;
	
	@GetMapping(value="volunteer")
	public List<volunteer> getAllvolunteer(){
		return volunteerService.getAllvolunteer();
		
	}
	
	@PostMapping(value="volunteer")
	public volunteer savevolunteer (@RequestBody volunteer volunteerToSave) {
		return volunteerService.savevolunteer(volunteerToSave);
	}
	
	@PutMapping(value="volunteer")
	public volunteer updatevolunteer (@RequestBody volunteer volunteerToUpdate) {
		return volunteerService.updatevolunteer(volunteerToUpdate);
	}
	
	@DeleteMapping(value="volunteer/{volunteerIdToDelete}")
	public String deletevolunteer (Long volunteeridToDelete) {
		return volunteerService.deletevolunteer(volunteeridToDelete);
	}
	
}