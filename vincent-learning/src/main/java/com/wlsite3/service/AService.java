package com.wlsite3.service;

import com.wlsite.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AService {

    @Autowired
    BService bService;

    public AService(BService bService){

    }

    public AService(){
        LogUtil.info("CONSTRUCTOR", this);
    }

    @PostConstruct
    public void customPostConstruct(){
        LogUtil.info("POST-CONSTRUCT", this);
    }



//    @Autowired
//    CService cService;
}
