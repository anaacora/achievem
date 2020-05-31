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
import achievem.backend.springboot.entities.Rank;
import achievem.backend.springboot.repositories.RankRepository;

@RestController
public class RankRestController {
	
	@Autowired
	private RankRepository repository;
	
	@RequestMapping(value = "/api/ranks", method = RequestMethod.GET)
    public List<Rank> findAll() {
    	      
        return repository.findAll();
      }

}
