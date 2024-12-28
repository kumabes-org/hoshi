package br.com.kumabe.hoshi.services;

import br.com.kumabe.hoshi.models.Instructor;

import java.util.List;

public interface InstructorService {
    public void create(Instructor instructor);
    public Instructor retrieve(Integer id);
    public void update(Integer id, Instructor instructor);
    public void delete(Integer id);
    public List<Instructor> list();
}
