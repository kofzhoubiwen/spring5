package com.wlsite3.service;

import com.wlsite.util.LogUtil;
import org.springframework.stereotype.Service;

@Service
public class JServiceImpl {
    void j(){
        LogUtil.info("J", this);
    }
}
