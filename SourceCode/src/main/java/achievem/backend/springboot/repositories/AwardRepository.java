package achievem.backend.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import achievem.backend.springboot.entities.Award;

public interface AwardRepository extends JpaRepository<Award, Long> {

}
