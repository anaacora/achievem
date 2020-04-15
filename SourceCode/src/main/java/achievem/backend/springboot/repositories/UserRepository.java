package achievem.backend.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import achievem.backend.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
