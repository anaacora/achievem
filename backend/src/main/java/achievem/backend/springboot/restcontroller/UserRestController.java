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

import achievem.backend.springboot.entities.User;
import achievem.backend.springboot.repositories.UserRepository;

@RestController
public class UserRestController {
    
    // Verdrahten der Repository-Klasse, um Karten in der Datenbank zu finden
    @Autowired
    private UserRepository repository;
    
    @RequestMapping(value = "/infmapi/v1/worlds/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getWorld(@PathVariable String name){        
        // Zur Id passende Welt suchen
        List<User> users = repository.findAll();
        return new ResponseEntity(users, HttpStatus.OK);
//        if(world.isPresent()) {
//            return new ResponseEntity(world.get(), HttpStatus.OK);
//        } else {
//            // Ansonsten ResourceNotFoundException (404)
//            return new ResponseEntity(HttpStatus.NOT_FOUND);
//        }        
    }
}
