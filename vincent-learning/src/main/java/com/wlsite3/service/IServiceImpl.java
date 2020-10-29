package com.wlsite3.service;


import org.springframework.beans.factory.annotation.Autowired;

public class IServiceImpl {

    JServiceImpl jService;

    @Autowired
    public IServiceImpl(String a){
        System.out.println("a: "+a);
    }

    @Autowired
    public IServiceImpl(String a, String b){
        System.out.println("a: "+a+", b: "+b);
    }


//    public void setXXXXXXX(JServiceImpl jService){
//        this.jService = jService;
//    }
//
    public void i(){
        jService.j();
    }

}
