package com.saksoft.test_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.test_application.entity.Employee;
import com.saksoft.test_application.service.EmployeeService;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/employee")
	public Employee save_Employee(@RequestBody Employee employee) {
		return employeeService.save_Employee(employee);
				
	}
    @GetMapping("/employee")
   public List<Employee> fetch_EmployeeList(){
    	return employeeService.fetch_Employee();
    }
    @GetMapping("/employee/{id}")
    public Employee fetch_Employee_by_id(@PathVariable("id") Long employee_id) {
    	return employeeService.fetch_Employee(employee_id);
    	
    }
   @DeleteMapping("/employee/{id}")
   public String delete_employee_by_id(@PathVariable("id") Long employee_id) {
	   employeeService.delete_employee_by_id(employee_id);
	   return "Employee deleted successfully";
   }
   @PutMapping("/employee/{id}")
   public Employee update_Employee_by_id(@PathVariable("id") Long employee_id,@RequestBody Employee employee) {
	   return employeeService.update_Employee_by_id(employee_id,employee);
	   
   }
   
}
