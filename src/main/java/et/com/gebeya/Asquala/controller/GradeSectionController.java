package et.com.gebeya.Asquala.controller;

import et.com.gebeya.Asquala.dto.GradeSectionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v2/grade_section")

public class GradeSectionController {
    @PostMapping
    public ResponseEntity<?> addGradeSection(@RequestBody GradeSectionDto gradeSectionDto){
        return ResponseEntity.ok("");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateGradeSection(@PathVariable("id") int id, @RequestBody GradeSectionDto gradeSectionDto){
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/grade-sections/{id}")
    public ResponseEntity<?> deleteGradeSection(@PathVariable("id") int id){
        return ResponseEntity.ok("");
    }
    @GetMapping("/grade-sections")
    public ResponseEntity<?> getAllGradeSection(){
        return ResponseEntity.ok("");
    }
    @GetMapping("/grade-sections/{id}")
    public ResponseEntity<?> getGradeSectionById(@PathVariable("id") int id){
        return ResponseEntity.ok("");
    }

    @GetMapping("/grade-sections")
    public ResponseEntity<?> getGradeSectionWithParam(@RequestParam(required = false) Map<String, String> search){
        return ResponseEntity.ok("");
    }

}
