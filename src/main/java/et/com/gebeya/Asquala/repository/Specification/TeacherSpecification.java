package et.com.gebeya.Asquala.repository.Specification;

import et.com.gebeya.Asquala.model.Teacher;
import org.springframework.data.jpa.domain.Specification;

public class TeacherSpecification {
    public static Specification<Teacher> getTeacherByName(String name){
        return ((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("teacher"),"%" + name + "%"));
    }

}
