package br.com.kumabe.hoshi.services.impl;

import br.com.kumabe.hoshi.models.Course;
import br.com.kumabe.hoshi.models.Student;
import br.com.kumabe.hoshi.repositories.StudentRepository;
import br.com.kumabe.hoshi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(final StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public void create(Student student) {

    }

    @Override
    public Student retrieve(Integer id) {
        Optional<Student> optional = studentRepository.findById(id);
        Student student = null;
        if(optional.isPresent()){
            student = optional.get();
        }
        return student;
    }

    @Override
    public void update(Integer id, Student student) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Student> list() {
        return studentRepository.findAll();
    }

    @Override
    public List<Course> getCoursesByStudentId(Integer id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found!"));
        return student.getCourses().stream().toList();
    }
}
