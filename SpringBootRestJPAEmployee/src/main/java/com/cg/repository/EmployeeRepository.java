package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}