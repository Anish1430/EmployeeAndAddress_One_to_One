package com.Anish.EmployeeAndAddress.repo;

import com.Anish.EmployeeAndAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
