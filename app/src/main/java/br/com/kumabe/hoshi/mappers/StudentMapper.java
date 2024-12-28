package br.com.kumabe.hoshi.mappers;

import br.com.kumabe.hoshi.dtos.CourseDTO;
import br.com.kumabe.hoshi.dtos.DepartmentDTO;
import br.com.kumabe.hoshi.dtos.InstructorDTO;
import br.com.kumabe.hoshi.dtos.StudentDTO;
import br.com.kumabe.hoshi.models.Course;
import br.com.kumabe.hoshi.models.Student;

import java.util.stream.Collectors;

public class StudentMapper {


    public static StudentDTO toStudentDTO(Student student){
        return new StudentDTO(
                student.getFirstName(),
                student.getId(),
                student.getLastName(),
                student.getPhone()
        );
    }

    public static CourseDTO toCourseDTO(Course course){
        return new CourseDTO(
                new DepartmentDTO(course.getDepartment().getId(), course.getDepartment().getName(), course.getDepartment().getLocation()),
                course.getDuration(),
                course.getId(),
                new InstructorDTO(new DepartmentDTO(course.getInstructor().getDepartment().getId(),course.getInstructor().getDepartment().getName(),course.getInstructor().getDepartment().getLocation()),
                        course.getInstructor().getFirstName(),
                        course.getInstructor().getHeadedBy(),
                        course.getInstructor().getId(),
                        course.getInstructor().getLastName(),
                        course.getInstructor().getPhone()
                ),
                course.getName()
        );
    }
}
