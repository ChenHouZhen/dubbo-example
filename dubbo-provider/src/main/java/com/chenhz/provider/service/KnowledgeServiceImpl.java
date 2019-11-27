package com.chenhz.provider.service;

import com.chenhz.api.KnowledgeService;

//@Slf4j
@com.alibaba.dubbo.config.annotation.Service
public class KnowledgeServiceImpl implements KnowledgeService {

    @Override
    public String queryKnowledgeByKgId(String kgId) {
        return ">>>>> call provide success...";
    }
}
