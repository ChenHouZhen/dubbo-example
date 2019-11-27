package com.chenhz.customer.controller;

import com.chenhz.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/hello")
    public String hello(){
        customerService.callKnowledgeProvider();
        return "调用成功";
    }
}
