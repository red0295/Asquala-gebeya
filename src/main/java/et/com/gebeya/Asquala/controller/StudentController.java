package et.com.gebeya.Asquala.controller;

import et.com.gebeya.Asquala.dto.StudentDto;
import et.com.gebeya.Asquala.dto.TeacherDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/students")
public class StudentController {
    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody StudentDto studentDto)
    {
        return ResponseEntity.ok("");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable("id") int id, @RequestBody StudentDto studentDto) {
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") int id)
    {
        return ResponseEntity.ok("");
    }

    @GetMapping
    public ResponseEntity<?> getAllStudents()
    {
        return ResponseEntity.ok("");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id)
    {
        return ResponseEntity.ok("");
    }




}
