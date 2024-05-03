package restfulapi.api.service;

import restfulapi.api.repository.StudentRepository;
import restfulapi.api.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;


@Service
public class StudentServiceIml implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void createStudent(Student student) {

    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return null;
    }

    @Override
    public List<Student> getStudentByName(String name) {
        return null;
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student updateStudentById(Student student) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public void deleteStudentById(Long id) {

    }

    @Override
    public void deleteAllStudents() {

    }
}
