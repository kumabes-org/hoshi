package br.com.kumabe.hoshi.services.impl;

import br.com.kumabe.hoshi.models.Course;
import br.com.kumabe.hoshi.repositories.CourseRepository;
import br.com.kumabe.hoshi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(final CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public void create(Course course) {

    }

    @Override
    public Course retrieve(Integer id) {
        return null;
    }

    @Override
    public void update(Integer id, Course course) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
