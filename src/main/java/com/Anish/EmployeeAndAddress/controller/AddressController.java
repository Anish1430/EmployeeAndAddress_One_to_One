package com.Anish.EmployeeAndAddress.controller;

import com.Anish.EmployeeAndAddress.model.Address;
import com.Anish.EmployeeAndAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")

public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping
      public List<Address> getAllAddress() {
         return addressService.getAllAddress();
    }

    @GetMapping("{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PostMapping
    public Address createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable Long id,@RequestBody Address updatedAddress) {
        return addressService.updateAddress(id,updatedAddress);
    }

    @DeleteMapping("/{id}")
    public void deleteAddress(@PathVariable Long id) {
          addressService.deleteAddress(id);
    }
}
