package br.com.kumabe.hoshi.controllers;

import br.com.kumabe.hoshi.dtos.DepartmentDTO;
import br.com.kumabe.hoshi.services.DepartmentService;
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
public class DepartmentRestController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentRestController(final DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @GetMapping(path="/v1/departments", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DepartmentDTO>> list(){
        List<DepartmentDTO> departments = null;
        //List<DepartmentDTO> departments = departmentService.list().stream().map(DepartmentDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(departments);
    }

}
