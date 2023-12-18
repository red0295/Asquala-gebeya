package et.com.gebeya.Asquala.repository.Specification;

import et.com.gebeya.Asquala.model.GradeSection;
import org.springframework.data.jpa.domain.Specification;

public class GradeSectionSpecification {
    public static Specification<GradeSection> GradeSectionBYHomeRoomTeacherId(int teacherId){
        return(root,cq,cb)->cb.equal(root.get("home_room_teacher_id"),teacherId);
    }


}
