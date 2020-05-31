package achievem.backend.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import achievem.backend.springboot.entities.Rank;

public interface RankRepository extends JpaRepository<Rank, Long>{

}
