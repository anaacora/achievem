package achievem.backend.springboot.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import achievem.backend.springboot.entities.Challenge;
import achievem.backend.springboot.repositories.ChallengeRepository;

@RestController
public class ChallengeRestController {
	
	 // Verdrahten der Repository-Klasse, um Karten in der Datenbank zu finden
    @Autowired
    private ChallengeRepository repository;
    
    @RequestMapping(value = "/api/challenges", method = RequestMethod.GET)
    public List<Challenge> findAll() {
    	      
        return repository.findAll();
      }

}
