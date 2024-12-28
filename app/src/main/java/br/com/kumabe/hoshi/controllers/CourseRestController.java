package br.com.kumabe.hoshi.controllers;

import br.com.kumabe.hoshi.dtos.CourseDTO;
import br.com.kumabe.hoshi.models.Course;
import br.com.kumabe.hoshi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class CourseRestController {
    private final CourseService courseService;

    @Autowired
    public CourseRestController(final CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping(path="/v1/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CourseDTO>> list(){
        List<CourseDTO> courses = null;
        //List<CourseDTO> courses = courseService.list().stream().map(CourseDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(courses);
    }
}
