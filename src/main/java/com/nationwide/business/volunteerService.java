package com.nationwide.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.domain.Volunteer;
import com.nationwide.repository.volunteerrepository;

@Service
public class volunteerService {

     @Autowired
	 private volunteerrepository Repository;
     
     
    public List<Volunteer> getAllvolunteer(){
    	 return Repository.findAll();
 		
 	}
 	
 	public Volunteer savevolunteer (Volunteer volunteerToSave) {
 		return Repository.save(volunteerToSave);
 	}
 	
 	
 	public Volunteer updatevolunteer (Volunteer volunteerToUpdate) {
 		return Repository.save(volunteerToUpdate);
 	}
 	
 	public String deletevolunteer (Long volunteeridToDelete) {
 		Repository.deleteById(volunteeridToDelete);
		return "You have deleted this Volunteer Opportunity!";
 	}
 	
}
