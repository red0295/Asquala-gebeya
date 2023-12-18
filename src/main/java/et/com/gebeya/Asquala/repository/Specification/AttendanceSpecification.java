package et.com.gebeya.Asquala.repository.Specification;

import et.com.gebeya.Asquala.model.Attendance;
import org.springframework.data.jpa.domain.Specification;

import java.util.Date;

public class AttendanceSpecification {
    public static Specification<Attendance> todaysAttendance(Date date){
        return(root,cq,cb)->cb.equal(root.get("attendance_date"),date);
    }

    public static Specification<Attendance> attendanceBetweenRange(Date start, Date end){
        return(root,cq,cb)->cb.between(root.get("attendance_date"),start,end);
    }

    public static Specification<Attendance> AllPast(Date end){
        return (root,cq,cb)->cb.lessThanOrEqualTo(root.get("attendance_date"),end);
    }

}
