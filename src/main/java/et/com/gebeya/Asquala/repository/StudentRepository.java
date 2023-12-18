package et.com.gebeya.Asquala.repository;

import et.com.gebeya.Asquala.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
