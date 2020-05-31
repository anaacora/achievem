package achievem.backend.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import achievem.backend.springboot.entities.Ranking;

public interface RankingRepository extends JpaRepository<Ranking, Long>{

}
