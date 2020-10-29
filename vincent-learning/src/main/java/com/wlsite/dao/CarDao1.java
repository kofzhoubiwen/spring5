package com.wlsite.dao;

import com.wlsite.util.LogUtil;

public class CarDao1 {

    public CarDao1(){
        System.out.println("CarDao1::Constructor");
    }


    public void query(){
        LogUtil.info("CarDao1:query", this);
    }
}
