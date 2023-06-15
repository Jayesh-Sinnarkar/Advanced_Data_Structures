package com.app.service;

import java.util.List;

import com.app.dtos.AddEmpResponce;
import com.app.pojos.Employee;

public interface EmployeeService {
	List<Employee> getAllEmps();
	Employee getEmpById();
	AddEmpResponce addEmp(Employee newEmp);
	String removeEmp(Long empId);
	Employee updateEmp(Employee detachedEmp);

}
