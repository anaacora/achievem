package achievem.backend.springboot.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import achievem.backend.springboot.entities.User;
import achievem.backend.springboot.repositories.UserRepository;

@RestController
public class UserRestController {
    
    @Autowired
    private UserRepository repository;
    
    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public ResponseEntity <List<Object[]>> findAll() {
    	
    	 List<Object[]> result=repository.findAllUsersByDate();
    	 
    	if(result != null && !result.isEmpty()){
    		return new ResponseEntity<List<Object[]>>(result, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<List<Object[]>>(HttpStatus.NOT_FOUND);
	    }        
    }
    
    @RequestMapping(value = "/api/users/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
    	
    	try {
    		repository.deleteById(id);
    	} catch (IllegalArgumentException e) {
        	return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
    	return new ResponseEntity<User>(HttpStatus.OK);
    }
    
    
}
