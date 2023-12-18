package et.com.gebeya.Asquala.repository;

import et.com.gebeya.Asquala.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance,Long> {
}
