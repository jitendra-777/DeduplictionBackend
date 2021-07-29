package com.jocota.DeDuplication.Dedupliction.contoller;

import com.jocota.DeDuplication.Dedupliction.entities.CustomerDetails;
import com.jocota.DeDuplication.Dedupliction.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerContoller {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody CustomerDetails customerDetails){
        System.out.println("in controller"+customerDetails);
        return customerService.saveCustomer(customerDetails);
    }
    @GetMapping("/fetchCustomer")
    public List<CustomerDetails> fetchCustomer(@RequestParam(required = false, defaultValue = "") String name ,
                                               @RequestParam(required = false, defaultValue = "") String panNumber,
                                               @RequestParam(required = false , defaultValue = "") String aadharNumber,
                                               @RequestParam(required = false , defaultValue = "") String DOB){
        return customerService.getCustomer(name , panNumber , aadharNumber , DOB);
    }
}
