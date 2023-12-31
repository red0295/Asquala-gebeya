package et.com.gebeya.Asquala.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.security.Timestamp;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String city;
    private String subCity;
    private String wereda;
    private String houseNumber;
    private boolean isActive;
    private Timestamp createdOn;
    private Timestamp updatedOn;

}
