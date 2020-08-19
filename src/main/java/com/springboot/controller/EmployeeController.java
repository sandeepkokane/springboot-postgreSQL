package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Employee;
import com.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	//fetching all the records
	@GetMapping("/emp")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}

	//fetching a record by id
	@GetMapping("/emp/{id}")
	public Optional<Employee> getEmp(@PathVariable int id) {
		return employeeService.getEmp(id);
	}

	//adding a new employee
	@PostMapping("/emp")
	public String saveEmp(@RequestBody Employee emp) {
		employeeService.saveEmp(emp);
		return "Employee details saved";
	}

	//updating a employee
	@PutMapping("/emp/{id}")
	public String updateEmp(@RequestBody Employee emp, @PathVariable int id) {
		employeeService.updateEmp(emp,id);
		return "updated successfully";
	}

	//deleting a employee
	@DeleteMapping("/emp/{id}")
	public String deleteEmp(@PathVariable int id) {

		employeeService.deleteEmp(id);

		return "Employee details deleted";
	}

}
