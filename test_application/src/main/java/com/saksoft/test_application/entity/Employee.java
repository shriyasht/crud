package com.saksoft.test_application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	private Long employee_id;
	private String employee_first_name;
	private String employee_last_name;
	private String employee_email;
	private String employee_age;
	public Long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_first_name() {
		return employee_first_name;
	}
	public void setEmployee_first_name(String employee_first_name) {
		this.employee_first_name = employee_first_name;
	}
	public String getEmployee_last_name() {
		return employee_last_name;
	}
	public void setEmployee_last_name(String employee_last_name) {
		this.employee_last_name = employee_last_name;
	}
	public String getEmployee_email() {
		return employee_email;
	}
	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}
	public String getEmployee_age() {
		return employee_age;
	}
	public void setEmployee_age(String employee_age) {
		this.employee_age = employee_age;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_first_name=" + employee_first_name
				+ ", employee_last_name=" + employee_last_name + ", employee_email=" + employee_email
				+ ", employee_age=" + employee_age + "]";
	}
	public Employee(Long employee_id, String employee_first_name, String employee_last_name, String employee_email,
			String employee_age) {
		super();
		this.employee_id = employee_id;
		this.employee_first_name = employee_first_name;
		this.employee_last_name = employee_last_name;
		this.employee_email = employee_email;
		this.employee_age = employee_age;
	}
	public Employee() {
		super();
	}
	
}