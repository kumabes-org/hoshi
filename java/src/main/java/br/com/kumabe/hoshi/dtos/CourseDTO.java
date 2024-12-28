package br.com.kumabe.hoshi.dtos;

import br.com.kumabe.hoshi.models.Course;
import br.com.kumabe.hoshi.models.Department;
import br.com.kumabe.hoshi.models.Instructor;
import br.com.kumabe.hoshi.models.Student;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CourseDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("department")
    private DepartmentDTO department;

    @JsonProperty("instructor")
    private InstructorDTO instructor;

    @JsonProperty("duration")
    private Integer duration;

    @JsonProperty("name")
    private String name;

    public CourseDTO(){}

    public CourseDTO(DepartmentDTO department, Integer duration, Integer id, InstructorDTO instructor, String name) {
        this.department = department;
        this.duration = duration;
        this.id = id;
        this.instructor = instructor;
        this.name = name;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InstructorDTO getInstructor() {
        return instructor;
    }

    public void setInstructor(InstructorDTO instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
