package br.com.kumabe.hoshi.controllers;

import br.com.kumabe.hoshi.dtos.CourseDTO;
import br.com.kumabe.hoshi.dtos.StudentDTO;
import br.com.kumabe.hoshi.mappers.StudentMapper;
import br.com.kumabe.hoshi.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private final StudentService studentService;

    @Autowired
    public StudentRestController(final StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(path="/v1/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentDTO>> list(){
        List<StudentDTO> students = studentService.list().stream()
                .map(StudentMapper::toStudentDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(students);
    }

    @GetMapping(path="/v1/students/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentDTO> get(@PathVariable Integer id){
        StudentDTO studentDTO = StudentMapper.toStudentDTO(studentService.retrieve(id));
        if(studentDTO == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(studentDTO);
        }
    }

    @GetMapping(path="/v1/students/{id}/courses", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CourseDTO>> getCoursesByStudentId(@PathVariable Integer id){
        List<CourseDTO> students = studentService.getCoursesByStudentId(id).stream()
                .map(StudentMapper::toCourseDTO)
                .toList();
        return ResponseEntity.ok(students);
    }
}
