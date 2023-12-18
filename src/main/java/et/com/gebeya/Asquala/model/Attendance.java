package et.com.gebeya.Asquala.model;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean isActive;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}

