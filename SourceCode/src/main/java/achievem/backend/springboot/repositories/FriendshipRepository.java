package achievem.backend.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import achievem.backend.springboot.entities.Friendship;

public interface FriendshipRepository extends JpaRepository<Friendship, Long> {

}
