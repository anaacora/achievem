package achievem.backend.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import achievem.backend.springboot.entities.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long> {
	
	@Query(value= "SELECT g.category, COUNT(g.category) FROM Goal as g GROUP BY g.category ORDER BY g.category DESC", nativeQuery = true)
	public List<Object[]> countTotalGoalsByCategory();

}
