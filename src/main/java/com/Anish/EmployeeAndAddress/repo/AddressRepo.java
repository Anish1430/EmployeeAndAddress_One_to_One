package com.Anish.EmployeeAndAddress.repo;

import com.Anish.EmployeeAndAddress.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AddressRepo extends JpaRepository<Address,Long> {
    Optional<Address> findById(Long id);
}
