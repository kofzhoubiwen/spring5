package com.wlsite3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DServiceImpl {

    @Autowired
    GServiceImpl gServiceImpl;
    EServiceImpl eServiceImpl;
    FServiceImpl fServiceImpl;

    public DServiceImpl(EServiceImpl eServiceImpl, FServiceImpl fServiceImpl){
        this.eServiceImpl = eServiceImpl;
        this.fServiceImpl = fServiceImpl;
    }

//    public DServiceImpl(){
//        System.out.println("1");
//    }
}
