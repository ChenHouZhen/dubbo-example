package com.chenhz.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chenhz.api.KnowledgeService;
import com.chenhz.customer.service.HelloCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HelloCustomerServiceImpl implements HelloCustomerService {


    // 当多个 Provider 时，怎么明确调用哪个服务提供方的？

    @Reference
    private KnowledgeService knowledgeService;

    @Override
    public void callKnowledgeProvider() {
        System.out.println(knowledgeService.queryKnowledgeByKgId(""));
    }
}
