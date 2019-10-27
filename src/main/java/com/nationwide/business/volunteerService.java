package com.nationwide.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nationwide.persistence.domain.volunteer;
import com.nationwide.persistence.repository.volunteerrepository;

@Service
public class volunteerService {

     @Autowired
	 private volunteerrepository Repository;
     
     
    public List<volunteer> getAllvolunteer(){
    	 return Repository.findAll();
 		
 	}
 	
 	public volunteer savevolunteer (volunteer volunteerToSave) {
 		return Repository.save(volunteerToSave);
 	}
 	
 	
 	public volunteer updatevolunteer (volunteer volunteerToUpdate) {
 		return Repository.save(volunteerToUpdate);
 	}
 	
 	public String deletevolunteer (Long volunteeridToDelete) {
 		Repository.deleteById(volunteeridToDelete);
		return "You have deleted this Volunteer Opportunity!";
 	}
 	
}
