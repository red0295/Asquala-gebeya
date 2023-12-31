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

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteGradeSection(@PathVariable("id") int id){
        return ResponseEntity.ok("");
    }
    @GetMapping
    public ResponseEntity<?> getAllGradeSection(){
        return ResponseEntity.ok("");
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getGradeSectionById(@PathVariable("id") int id){
        return ResponseEntity.ok("");
    }



}
