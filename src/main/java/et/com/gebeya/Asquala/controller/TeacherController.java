package et.com.gebeya.Asquala.controller;

import et.com.gebeya.Asquala.dto.TeacherDto;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/api/v2/teachers")
public class TeacherController {

    @PostMapping
    public ResponseEntity<?> addTeacher(@RequestBody TeacherDto teacherDto) {
        return ResponseEntity.ok("");
    }

    @GetMapping
    public ResponseEntity<?> getTeacher(@PageableDefault(page = 0, size = 10) Pageable pageable) {
        return ResponseEntity.ok("");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTeachers(@PathVariable("id") int id, @RequestBody TeacherDto Dto) {
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/teachers/{id}")
    public ResponseEntity<?> deleteTeachers(@PathVariable("id") int id) {
        return ResponseEntity.ok("");
    }

    @GetMapping("/teachers/{id}")
    public ResponseEntity<?> getTeachersSubject(@PathVariable("id") int id) {
        return ResponseEntity.ok("");
    }
}
