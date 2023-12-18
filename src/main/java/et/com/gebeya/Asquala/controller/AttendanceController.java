package et.com.gebeya.Asquala.controller;


import et.com.gebeya.Asquala.dto.AttendanceDto;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.Map;

@RestController
@RequestMapping("/api/v2/attendancce")

public class AttendanceController {
    @GetMapping
    public ResponseEntity<?> getAttendanceByParam(@RequestParam(required = false) Map<String, String> search, @PageableDefault(page = 0, size = 10) Pageable pageable){
        return ResponseEntity.ok("");
    }

    @PostMapping
    public ResponseEntity<?> addAttendance(@RequestBody AttendanceDto attendanceDto){
        return ResponseEntity.ok("");
    }


}
