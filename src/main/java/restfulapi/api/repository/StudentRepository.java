package restfulapi.api.repository;

import org.springframework.stereotype.Repository;
import restfulapi.api.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameOrderByName(String name);
    Optional<Student> findById(Long id);
    List<Student> findAllByOrderByName();
}