package achievem.backend.springboot.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import achievem.backend.springboot.repositories.GoalRepository;

@RestController
public class GoalRestController {
	
    @Autowired
    private GoalRepository repository;
    
    @RequestMapping(value = "/api/goals", method = RequestMethod.GET)
    public ResponseEntity <List<Object[]>> findAll() {
    	
    	List<Object[]> result = repository.countTotalGoalsByCategory();
    	
    	if(result != null && !result.isEmpty()){
    	    return new ResponseEntity<List<Object[]>>(result, HttpStatus.OK);
    	} else {
    	    return new ResponseEntity<List<Object[]>>(HttpStatus.NOT_FOUND);
    	}  	
    	    
    }
}

