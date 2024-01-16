package com.example.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swagger.entity.Designation;
import com.example.swagger.entity.Employee;
import com.example.swagger.repository.DesignationRepo;
import com.example.swagger.repository.EmployeeRepo;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	EmployeeRepo employeeRepo;
	@Autowired
	DesignationRepo designationRepo;

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmpDetailsById(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).orElse(null);
	}

	@Override
	public Employee createEmpDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public List<Designation> getAllDesign() {
		// TODO Auto-generated method stub
		return designationRepo.findAll();
	}

	@Override
	public Designation getDesignDetailsById(int id) {
		// TODO Auto-generated method stub
		return designationRepo.findById(id).orElse(null);
	}

	@Override
	public Designation createDesignDetails(Designation designation) {
		// TODO Auto-generated method stub
		return designationRepo.save(designation);
	}

}
