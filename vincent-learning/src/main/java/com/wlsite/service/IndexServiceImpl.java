package com.wlsite.service;


import com.wlsite.dao.OrderDao;
import com.wlsite.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("aaa")
public class IndexServiceImpl implements  IndexService{

    public IndexServiceImpl(){

    }

    @Autowired
    OrderDao orderDao;

    public void service() {
        LogUtil.info("SERVICE...", this);
    }

    public void orderTest(){
        orderDao.query("test");
    }
}
