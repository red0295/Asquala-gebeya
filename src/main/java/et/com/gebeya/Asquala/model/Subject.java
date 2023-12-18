package et.com.gebeya.Asquala.model;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean isActive;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    @ManyToMany(mappedBy = "subjects")
    private Set<Teacher> teachers;

    @ManyToMany(mappedBy = "subjects")
    private Set<GradeSection> gradeSections;
}
