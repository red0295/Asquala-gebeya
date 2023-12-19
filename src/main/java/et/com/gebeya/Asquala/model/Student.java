package et.com.gebeya.Asquala.model;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Set;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private Long studentId;
    private Boolean isActive;
    private Timestamp created_on;
    private Timestamp updated_on;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @ManyToMany
    @JoinTable(name = "student_guardian",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "guardian_id"))
    private Set<Guardian> guardians;
    @ManyToOne
    @JoinColumn(name = "grade_section_id")
    private GradeSection gradeSection;
    @OneToMany(mappedBy = "student")
    private Set<Attendance> attendances;

}

