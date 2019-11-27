package com.chenhz.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chenhz.api.KnowledgeService;
import com.chenhz.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {


    @Reference
    private KnowledgeService knowledgeService;

    @Override
    public void callKnowledgeProvider() {
        System.out.println(knowledgeService.queryKnowledgeByKgId(""));
    }
}
