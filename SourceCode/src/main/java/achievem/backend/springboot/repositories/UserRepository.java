package achievem.backend.springboot.repositories;

import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import achievem.backend.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

@Query(value= "SELECT u.name, u.registration_date FROM user u ORDER BY u.registration_date", nativeQuery = true)
public List<Object[]> findAllUsersByDate();

}
