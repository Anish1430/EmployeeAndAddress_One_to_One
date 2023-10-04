package com.Anish.EmployeeAndAddress.repo;

import com.Anish.EmployeeAndAddress.model.Address;
import com.Anish.EmployeeAndAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Optional<Employee> findById(Long id);
}
