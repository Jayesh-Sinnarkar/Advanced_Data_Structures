package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.dtos.ApiResponce;
import com.app.pojos.Employee;
import com.app.service.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping
	public List<Employee> fetchAllEmps(){
		return empService.getAllEmps();
	}
	
	@PostMapping
	public ResponseEntity<?> addNewEmp(@RequestBody Employee newEmp)
	{
		System.out.println(newEmp);
		return new ResponseEntity<>(empService.addEmp(newEmp), HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{empId}")
	public ApiResponce deleteEmp(@PathVariable Long empId)
	{
		return new ApiResponce(empService.removeEmp(empId));
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee detachedEmp)
	{
		return empService.updateEmp(detachedEmp);
	}
	
	
	
	
	
	
	
	
	
}
