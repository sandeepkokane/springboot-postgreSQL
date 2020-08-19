package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Employee;
import com.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAll() {
		List<Employee> emp = new ArrayList<>();
		employeeRepository.findAll().forEach(emp::add);
		return emp;
	}

	public void saveEmp(Employee emp) {
		employeeRepository.save(emp);
	}

	public Optional<Employee> getEmp(int id) {
		Optional<Employee> emp = employeeRepository.findById(id);
		return emp;
	}

	public void deleteEmp(int id) {
		employeeRepository.deleteById(id);
	}

	public void updateEmp(Employee emp2, int id) {
		employeeRepository.save(emp2);
	}
}
