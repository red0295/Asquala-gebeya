package et.com.gebeya.Asquala.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Setter
@Getter
@AllArgsConstructor
@ToString
public class StudentDto {
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private Long studentId;
    private AddressDto addressDto;
}
