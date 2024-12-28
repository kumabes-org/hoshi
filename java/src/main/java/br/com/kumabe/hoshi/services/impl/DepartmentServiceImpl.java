package br.com.kumabe.hoshi.services.impl;

import br.com.kumabe.hoshi.models.Department;
import br.com.kumabe.hoshi.repositories.DepartmentRepository;
import br.com.kumabe.hoshi.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(final DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void create(Department department) {

    }

    @Override
    public Department retrieve(Integer id) {
        return null;
    }

    @Override
    public void update(Integer id, Department department) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Department> list() {
        return departmentRepository.findAll();
    }
}
