package et.com.gebeya.Asquala.repository.Specification;

import et.com.gebeya.Asquala.model.GradeSection;
import et.com.gebeya.Asquala.model.Student;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class StudentSpecification {
    public static Specification<Student> StudentByName(String name){
        return(root,cq,cb)->cb.equal(root.get("firstName"),name);
    }
    private static Join<Student, GradeSection> getStudentGradeSectionJoin(Root<Student> root) {
        return root.join("grade_section");
    }

    public static Specification<Student> StudentByGradeSection(String Grade){
        return (root,cq,cb)->{
            Join<Student, GradeSection> studentGradeSection = getStudentGradeSectionJoin(root);
            return cb.equal(studentGradeSection.get("grade"),Grade);
        };
    }


}
