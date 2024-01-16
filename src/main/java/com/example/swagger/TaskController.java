package com.example.swagger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.entity.Designation;
import com.example.swagger.entity.Employee;
import com.example.swagger.service.TaskService;

@RestController
@RequestMapping("/map")
public class TaskController {
	@Autowired
	TaskService taskService;
@GetMapping("/emp")
	public List<Employee> getAllEmp() {
		return taskService.getAllEmp();
	}
@GetMapping("/emp/{id}")
	public Employee getEmpDetailsById(@PathVariable int id) {

		return taskService.getEmpDetailsById(id);
	}
@PostMapping("/emp")
	public Employee createEmpDetails(@RequestBody Employee employee) {
		return taskService.createEmpDetails(employee);
	}
//FOR DESIGNATION
@GetMapping("/des")
public List<Designation> getAllDesign() {
	return taskService.getAllDesign();
}
@GetMapping("/des/{id}")
public Designation getDesignDetailsById(@PathVariable int id) {

	return taskService.getDesignDetailsById(id);
}
@PostMapping("/des")
public Designation createDesignDetails(@RequestBody Designation designation) {
	return taskService.createDesignDetails(designation);
}
}
