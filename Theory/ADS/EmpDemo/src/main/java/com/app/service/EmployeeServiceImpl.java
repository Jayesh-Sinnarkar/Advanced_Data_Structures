package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dtos.AddEmpResponce;
import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<Employee> getAllEmps() {
		
		return empRepo.findAll();
	}

	@Override
	public Employee getEmpById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddEmpResponce addEmp(Employee newEmp) {
		Employee emp = empRepo.save(newEmp);
		return modelMapper.map(emp, AddEmpResponce.class);
	}

	@Override
	public String removeEmp(Long empId) {
		
		Employee emp = empRepo.findById(empId)
				.orElseThrow(()-> new  ResourceNotFoundException("Employee Not FOund"));
		empRepo.delete(emp);
		return "Employee "+emp.getFirstName()+" deleted successfully";
	}

	@Override
	public Employee updateEmp(Employee detachedEmp) {
		
		return empRepo.save(detachedEmp);
		
	}

}
