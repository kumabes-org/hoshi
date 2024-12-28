package br.com.kumabe.hoshi.services;

import br.com.kumabe.hoshi.models.Course;
import br.com.kumabe.hoshi.models.Student;

import java.util.List;

public interface StudentService {
    public void create(Student student);
    public Student retrieve(Integer id);
    public void update(Integer id, Student student);
    public void delete(Integer id);
    public List<Student> list();
    public List<Course> getCoursesByStudentId(Integer id);
}
