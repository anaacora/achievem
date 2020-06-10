package achievem.backend.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import achievem.backend.springboot.entities.Ranking;
import achievem.backend.springboot.repositories.RankingRepository;

@RestController
public class RankingRestController {
	
	@Autowired
	private RankingRepository repository;
	
	@RequestMapping(value= "/api/rankings", method = RequestMethod.GET)
    public ResponseEntity<List<Ranking>> getRankings() {
		
		List<Ranking> result = this.repository.findAll();
    	      
		if (!result.isEmpty()) {
			return new ResponseEntity<List<Ranking>>(result, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Ranking>>(HttpStatus.NOT_FOUND);
		}
	}     
		
	@RequestMapping(value= "/api/rankings/{id}", method = RequestMethod.PUT)
	Ranking replaceRanking(@RequestBody Ranking newRanking, @PathVariable Long id) {
	
	    return repository.findById(id)
	      .map(ranking -> {
		        ranking.setLevel(newRanking.getLevel());
		        ranking.setTotalScore(newRanking.getTotalScore());
		        ranking.setStage(newRanking.getStage());
		        return repository.save(ranking);
	      })
	      .orElseGet(() -> {
		        newRanking.setId(id);
		        return repository.save(newRanking);
	      });
	 }
}
