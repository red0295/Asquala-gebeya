package et.com.gebeya.Asquala.controller;

import et.com.gebeya.Asquala.dto.SubjectDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/subject/")
public class SubjesctController {
    public ResponseEntity<?> addSubject(@RequestBody SubjectDto subjectDto)
    {
        return ResponseEntity.ok("");
    }

    @GetMapping
    public ResponseEntity<?> getSubjects()
    {
        return ResponseEntity.ok("");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSubjects(@PathVariable("id") int id, @RequestBody SubjectDto subjectDto)
    {
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSubjects(@PathVariable("id") int id)
    {
        return ResponseEntity.ok("");
    }

}
