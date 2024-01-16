package com.example.swagger.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.swagger.entity.Designation;
import com.example.swagger.entity.Employee;

@Service
public interface TaskService {

	public List<Employee> getAllEmp();

	public Employee getEmpDetailsById(int id);

	public Employee createEmpDetails(Employee employee);

	public List<Designation> getAllDesign();

	public Designation getDesignDetailsById(int id);

	public Designation createDesignDetails(Designation designation);

}
