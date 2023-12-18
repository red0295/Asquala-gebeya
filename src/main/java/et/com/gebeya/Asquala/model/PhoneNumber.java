package et.com.gebeya.Asquala.model;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class PhoneNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    private boolean isActive;
    private Timestamp createdOn;
    private Timestamp updatedOn;
}

