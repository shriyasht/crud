package com.saksoft.test_application.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.test_application.entity.Employee;
import com.saksoft.test_application.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired 
	private EmployeeRepository employeeRespository;
	@Override
	public Employee save_Employee(Employee employee) {
	
		return employeeRespository.save(employee);
	}
	@Override
	public List<Employee> fetch_Employee() {
		return employeeRespository.findAll();
	}
	@Override
	public Employee fetch_Employee(Long employee_id) {
		
		return employeeRespository.findById(employee_id).get();
	}
	@Override
	public void delete_employee_by_id(Long employee_id) {
		 employeeRespository.deleteById(employee_id);
		
	}
	@Override
	public Employee update_Employee_by_id(Long employee_id, Employee employee) {
		Employee empDB= employeeRespository.findById(employee_id).get();
		
		if(Objects.nonNull(employee.getEmployee_first_name()) && !"".equalsIgnoreCase(employee.getEmployee_first_name())) {
		
		empDB.setEmployee_first_name(employee.getEmployee_first_name());
		}
		
		if(Objects.nonNull(employee.getEmployee_last_name()) && !"".equalsIgnoreCase(employee.getEmployee_last_name())) {
		
		empDB.setEmployee_last_name(employee.getEmployee_last_name());
		}
		if(Objects.nonNull(employee.getEmployee_email()) && !"".equalsIgnoreCase(employee.getEmployee_email())) {
			
			empDB.setEmployee_email(employee.getEmployee_email());
			}
		if(Objects.nonNull(employee.getEmployee_age()) && !"".equalsIgnoreCase(employee.getEmployee_age())) {
				
				empDB.setEmployee_age(employee.getEmployee_age());
				}
		return  employeeRespository.save(empDB);
	}
}
    
