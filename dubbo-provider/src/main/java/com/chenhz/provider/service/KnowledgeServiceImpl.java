package com.chenhz.provider.service;

import com.chenhz.api.KnowledgeService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@com.alibaba.dubbo.config.annotation.Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Override
    public String queryKnowledgeByKgId(String kgId) {
        return ">>>>> call provide success...";
    }
}
