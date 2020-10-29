package com.wlsite.web;


import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletException;


public class CustomWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        System.out.println("Hello");
    }
}
