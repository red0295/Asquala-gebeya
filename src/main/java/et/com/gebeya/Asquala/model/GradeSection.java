package et.com.gebeya.Asquala.model;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class GradeSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String grade;
    private String section;



    private boolean isActive;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    @OneToMany(mappedBy = "gradeSection")
    private Set<Student> students;

    @OneToOne
    private Teacher homeRoomTeacher;

    @ManyToMany
    @JoinTable(name = "grade_section_subject",
            joinColumns = @JoinColumn(name = "grade_section_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private Set<Subject> subjects;
}
