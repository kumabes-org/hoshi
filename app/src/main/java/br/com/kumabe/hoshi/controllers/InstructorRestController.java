package br.com.kumabe.hoshi.controllers;

import br.com.kumabe.hoshi.dtos.InstructorDTO;
import br.com.kumabe.hoshi.services.InstructorService;
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
public class InstructorRestController {
    private final InstructorService instructorService;

    @Autowired
    public InstructorRestController(final InstructorService instructorService){
        this.instructorService = instructorService;
    }

    @GetMapping(path="/v1/instructors", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<InstructorDTO>> list(){
        List<InstructorDTO> instructors = null;
        //List<InstructorDTO> instructors = instructorService.list().stream().map(InstructorDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok(instructors);
    }
}
