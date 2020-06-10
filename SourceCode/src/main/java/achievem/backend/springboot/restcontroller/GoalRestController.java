package achievem.backend.springboot.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import achievem.backend.springboot.entities.Goal;
import achievem.backend.springboot.repositories.GoalRepository;

@RestController
public class GoalRestController {
	
    @Autowired
    private GoalRepository repository;
    
    @RequestMapping(value = "/api/goals", method = RequestMethod.GET)
    public ResponseEntity<List<Goal>> getGoals(){
    	
    	List<Goal> result = this.repository.findAll();
    	      
		if (!result.isEmpty()) {
			return new ResponseEntity<List<Goal>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Goal>>(HttpStatus.NOT_FOUND);
    	}
    }
    
    @RequestMapping(value = "/api/goals/{id}", method = RequestMethod.GET)
    public ResponseEntity<Goal> getGoalById(@PathVariable Long id){
    	
        Optional<Goal> result = repository.findById(id);
        
        if(result.isPresent()){
            return new ResponseEntity<Goal>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Goal>(HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(value = "/api/goalsByCategory", method = RequestMethod.GET)
    public ResponseEntity <List<Object[]>> findGoalsByCategory() {
    	
    	List<Object[]> result = repository.countTotalGoalsByCategory();
    	
    	if(result != null && !result.isEmpty()){
    	    return new ResponseEntity<List<Object[]>>(result, HttpStatus.OK);
    	} else {
    	    return new ResponseEntity<List<Object[]>>(HttpStatus.NOT_FOUND);
    	}  	
    	    
    }
    
    @RequestMapping(value= "/api/goal", method = RequestMethod.POST)
    Goal addGoal(@RequestBody Goal goal) {
	
	    return repository.save(goal);
	 }
}

