package com.nationwide.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nationwide.business.volunteerService;
import com.nationwide.domain.Volunteer;

@RestController
@CrossOrigin("*")

@RequestMapping("/volunteerapp")
public class volunteercontroller {
    
	@Autowired
	private volunteerService volunteerService;
	
	@CrossOrigin("*")
	@GetMapping(value="/volunteer")
	public List<Volunteer> getAllvolunteer(){
		return volunteerService.getAllvolunteer();
	}
	@CrossOrigin("*")
	@PostMapping(value="/volunteer")
	public Volunteer savevolunteer (@RequestBody Volunteer volunteerToSave) {
		System.out.println("hello testjng");
		return volunteerService.savevolunteer(volunteerToSave);
	}
	@CrossOrigin("*")
	@PutMapping(value="/volunteer")
	public Volunteer updatevolunteer (@RequestBody Volunteer volunteerToUpdate) {
		return volunteerService.updatevolunteer(volunteerToUpdate);
	}
	@CrossOrigin("*")
	@DeleteMapping(value="/volunteer/{volunteerIdToDelete}")
	public String deletevolunteer (@PathVariable Long volunteerIdToDelete) {
		return volunteerService.deletevolunteer(volunteerIdToDelete);
	}
	
}