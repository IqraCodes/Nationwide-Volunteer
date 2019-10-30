package com.nationwide.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nationwide.business.volunteerService;
import com.nationwide.domain.Volunteer;

@RestController
@RequestMapping("/volunteerapp")
public class volunteercontroller {
    
	@Autowired
	private volunteerService volunteerService;
	
	@GetMapping(value="/volunteer")
	public List<Volunteer> getAllvolunteer(){
		return volunteerService.getAllvolunteer();
		
	}
	
	@PostMapping(value="/volunteer")
	public Volunteer savevolunteer (@RequestBody Volunteer volunteerToSave) {
		return volunteerService.savevolunteer(volunteerToSave);
	}
	
	@PutMapping(value="/volunteer")
	public Volunteer updatevolunteer (@RequestBody Volunteer volunteerToUpdate) {
		return volunteerService.updatevolunteer(volunteerToUpdate);
	}
	
	@DeleteMapping(value="/volunteer/{volunteerIdToDelete}")
	public String deletevolunteer (Long volunteeridToDelete) {
		return volunteerService.deletevolunteer(volunteeridToDelete);
	}
	
}