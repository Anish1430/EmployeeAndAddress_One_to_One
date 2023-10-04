package com.Anish.EmployeeAndAddress.controller;

import com.Anish.EmployeeAndAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
}
