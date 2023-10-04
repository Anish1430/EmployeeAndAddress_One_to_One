package com.Anish.EmployeeAndAddress.repo;

import com.Anish.EmployeeAndAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
