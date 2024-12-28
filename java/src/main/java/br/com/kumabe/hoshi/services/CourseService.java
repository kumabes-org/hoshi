package br.com.kumabe.hoshi.services;

import br.com.kumabe.hoshi.models.Course;
import br.com.kumabe.hoshi.models.Student;

import java.util.List;

public interface CourseService {
    public void create(Course course);
    public Course retrieve(Integer id);
    public void update(Integer id, Course course);
    public void delete(Integer id);
    public List<Course> list();
}
