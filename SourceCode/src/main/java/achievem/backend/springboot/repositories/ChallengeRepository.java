package achievem.backend.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import achievem.backend.springboot.entities.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

}
