package restfulapi.api.service;

import restfulapi.api.model.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    void createStudent(Student student);
    Optional<Student> getStudentById(Long id);
    List<Student> getStudentByName(String name);
    Student saveStudent(Student student);
    Student updateStudentById(Student student);
    List<Student> getAllStudents();
    void deleteStudentById(Long id);
    void deleteAllStudents();
}
