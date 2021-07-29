package com.jocota.DeDuplication.Dedupliction.service;

import com.jocota.DeDuplication.Dedupliction.entities.CustomerDetails;
import com.jocota.DeDuplication.Dedupliction.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public String saveCustomer(CustomerDetails customerDetails){
        System.out.println(customerDetails);
        customerRepository.save(customerDetails);
        return "customer saved succcessfully";
    }
    public List<CustomerDetails> getCustomer(String name , String panNumber , String aadharNumber , String DOB){
        return customerRepository.getCustomerDetails(name , panNumber ,aadharNumber , DOB);
    }


}
