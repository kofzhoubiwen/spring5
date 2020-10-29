package com.wlsite.dao;

import com.wlsite.util.LogUtil;

public class CarDao2 {

    public CarDao2(){
        System.out.println("CarDao2::Constructor");
    }


    public void query(){
        LogUtil.info("CarDao2:query", this);
    }
}
