package com.Anish.EmployeeAndAddress.service;

import com.Anish.EmployeeAndAddress.model.Address;
import com.Anish.EmployeeAndAddress.model.Employee;
import com.Anish.EmployeeAndAddress.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElseThrow(() ->
                new NoSuchElementException("Not found"));
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        return employeeRepo.findById(id).map(employee -> {
            employee.setAddress(updatedEmployee.getAddress());
            employee.setFirstName(updatedEmployee.getFirstName());
            employee.setLastName(updatedEmployee.getLastName());
            return employeeRepo.save(employee);
        }).orElseThrow(() -> new NoSuchElementException("Not found"));
    }
}
