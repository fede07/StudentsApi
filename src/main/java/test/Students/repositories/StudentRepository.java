package test.Students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.Students.entities.Student;

@RepositoryRestResource(path = "students", collectionResourceRel = "stu")
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
