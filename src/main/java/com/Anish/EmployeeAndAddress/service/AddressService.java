package com.Anish.EmployeeAndAddress.service;

import com.Anish.EmployeeAndAddress.model.Address;
import com.Anish.EmployeeAndAddress.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }


    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow(() ->
                new NoSuchElementException("Not found"));
    }

    public Address createAddress(Address address) {
        return addressRepo.save(address);
    }

    public Address updateAddress(Long id, Address updatedAddress) {

        return addressRepo.findById(id).map(address -> {
            address.setStreet(updatedAddress.getStreet());
            address.setCity(updatedAddress.getCity());
            address.setState(updatedAddress.getState());
            address.setZipCode(updatedAddress.getZipCode());
            return addressRepo.save(address);
        }).orElseThrow(() -> new NoSuchElementException("Not found"));
    }

    public void deleteAddress(Long id) {
         addressRepo.deleteById(id);

    }
}
