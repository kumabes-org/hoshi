package br.com.kumabe.hoshi.dtos;

import br.com.kumabe.hoshi.models.Department;
import br.com.kumabe.hoshi.models.Instructor;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InstructorDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("department")
    private DepartmentDTO department;

    @JsonProperty("headed_by")
    private String headedBy;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("phone")
    private String phone;

    public InstructorDTO(){}

    public InstructorDTO(DepartmentDTO department, String firstName, String headedBy, Integer id, String lastName, String phone) {
        this.department = department;
        this.firstName = firstName;
        this.headedBy = headedBy;
        this.id = id;
        this.lastName = lastName;
        this.phone = phone;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHeadedBy() {
        return headedBy;
    }

    public void setHeadedBy(String headedBy) {
        this.headedBy = headedBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
