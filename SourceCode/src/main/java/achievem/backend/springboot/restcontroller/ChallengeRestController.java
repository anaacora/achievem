package achievem.backend.springboot.restcontroller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import achievem.backend.springboot.entities.Challenge;
import achievem.backend.springboot.repositories.ChallengeRepository;

@RestController
public class ChallengeRestController {
	
    @Autowired
    private ChallengeRepository repository;
    
    @RequestMapping(value = "/api/challenges", method = RequestMethod.GET)
    public ResponseEntity<List<Challenge>> getChallenges(){
    	
    	List<Challenge> result = this.repository.findAll();
    	
    	if (!result.isEmpty()) {
			return new ResponseEntity<List<Challenge>>(
					result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Challenge>>(
				HttpStatus.NOT_FOUND);
	}

    	     
      }

}
