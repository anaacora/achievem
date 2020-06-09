package achievem.backend.springboot.restcontroller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import achievem.backend.springboot.entities.Award;
import achievem.backend.springboot.repositories.AwardRepository;

@RestController
public class AwardRestController {
	
	@Autowired
	private AwardRepository repository;
	
	@RequestMapping(value = "/api/awards", method = RequestMethod.GET)  
	public ResponseEntity<List<Award>> getAwards(){
		
		List<Award> result = this.repository.findAll();
		
		if (!result.isEmpty()) {
			return new ResponseEntity<List<Award>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Award>>(HttpStatus.NOT_FOUND);
		}
	}	
	

}

