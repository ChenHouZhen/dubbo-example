package com.chenhz.customer.controller;

import com.chenhz.customer.service.HelloCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCustomerController {

    @Autowired
    private HelloCustomerService helloCustomerService;


    @GetMapping("/hello")
    public String hello(){
        helloCustomerService.callKnowledgeProvider();
        return "调用成功";
    }
}
