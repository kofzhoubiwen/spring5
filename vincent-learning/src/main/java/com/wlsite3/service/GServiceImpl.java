package com.wlsite3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GServiceImpl {
    @Autowired
    HServiceImpl hServiceImpl;
}
