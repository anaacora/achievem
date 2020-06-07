package achievem.backend.springboot.restcontroller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import achievem.backend.springboot.entities.Friendship;
import achievem.backend.springboot.repositories.FriendshipRepository;

@RestController
public class FriendshipRestController {
	
    @Autowired
    private FriendshipRepository repository;
    
    @RequestMapping(value = "/api/friendships", method = RequestMethod.GET)
    public ResponseEntity<List<Friendship>> getFriendships(){
    	List<Friendship> result = this.repository.findAll();
    	      
    			if (!result.isEmpty()) {
    				return new ResponseEntity<List<Friendship>>(
    						result, HttpStatus.OK);
    			} else {
    				return new ResponseEntity<List<Friendship>>(
    					HttpStatus.NOT_FOUND);
    		}
      }
	

}
