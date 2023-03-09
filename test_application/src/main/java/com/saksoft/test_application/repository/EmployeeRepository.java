package com.saksoft.test_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saksoft.test_application.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
