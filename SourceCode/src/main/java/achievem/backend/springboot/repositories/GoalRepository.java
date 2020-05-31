package achievem.backend.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import achievem.backend.springboot.entities.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long> {

}
