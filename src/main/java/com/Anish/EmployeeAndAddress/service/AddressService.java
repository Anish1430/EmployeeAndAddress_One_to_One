package com.Anish.EmployeeAndAddress.service;

import com.Anish.EmployeeAndAddress.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;
}
