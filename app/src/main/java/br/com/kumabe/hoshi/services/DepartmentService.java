package br.com.kumabe.hoshi.services;

import br.com.kumabe.hoshi.models.Department;

import java.util.List;

public interface DepartmentService {
    public void create(Department department);
    public Department retrieve(Integer id);
    public void update(Integer id, Department department);
    public void delete(Integer id);
    public List<Department> list();
}
