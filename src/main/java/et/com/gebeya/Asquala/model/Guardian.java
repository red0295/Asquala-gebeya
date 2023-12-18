package et.com.gebeya.Asquala.model;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private boolean isActive;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany(mappedBy = "guardians")
    private Set<Student> students;
}

