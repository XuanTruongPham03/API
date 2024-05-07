package restfulapi.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restfulapi.api.model.Student;
import restfulapi.api.repository.StudentRepository;
import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        Optional<Student> exsitStudent = studentRepository.findById(student.getId());
        if (exsitStudent.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Student already exists");
        }
        Student createdStudent = studentRepository.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body("Student created: \n" + createdStudent);
    }

    @GetMapping("search/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable Long id) {
        Optional<Student> student = studentRepository.findById(id);
        return student.map(
                value -> ResponseEntity.ok().body(value)).orElseGet(()
                -> ResponseEntity.notFound().build());
    }

    @GetMapping("search")
    public ResponseEntity<?> getStudents(@RequestParam(required = false) String name) {
        List<Student> students;
        if (name == null || name.isEmpty()) {
            students = studentRepository.findAllByOrderByName();
        } else {
            students = studentRepository.findByNameOrderByName(name);
        }
        return ResponseEntity.ok().body(students);
    }
}