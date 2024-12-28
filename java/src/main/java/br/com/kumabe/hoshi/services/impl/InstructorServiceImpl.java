package br.com.kumabe.hoshi.services.impl;

import br.com.kumabe.hoshi.models.Instructor;
import br.com.kumabe.hoshi.repositories.InstructorRepository;
import br.com.kumabe.hoshi.services.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("instructorService")
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    @Autowired
    public InstructorServiceImpl(final InstructorRepository instructorRepository){
        this.instructorRepository = instructorRepository;
    }

    @Override
    public void create(Instructor instructor) {

    }

    @Override
    public Instructor retrieve(Integer id) {
        return null;
    }

    @Override
    public void update(Integer id, Instructor instructor) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Instructor> list() {
        return instructorRepository.findAll();
    }
}
