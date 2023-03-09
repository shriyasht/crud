package com.saksoft.test_application.service;


import java.util.List;

import com.saksoft.test_application.entity.Employee;

public interface EmployeeService {
	public Employee save_Employee(Employee employee);

	public List<Employee> fetch_Employee();

	public Employee fetch_Employee(Long employee_id);

	public void delete_employee_by_id(Long employee_id);

	public Employee update_Employee_by_id(Long employee_id, Employee employee);
	
}
