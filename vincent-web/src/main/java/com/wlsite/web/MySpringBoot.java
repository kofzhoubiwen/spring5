package com.wlsite.web;

import com.wlsite.config.SpringConfig;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class MySpringBoot {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(80);
        tomcat.addContext("/", new File(System.getProperty("java.io.tmpdir")).getAbsolutePath());

        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(SpringConfig.class);
        // @EnableWebMvc 如果这个时候初始化会报错 因为环境还没初始化
        // ac.refresh();

        // 初始化过程中会调用父类FrameworkServlet的初始化方法initServletBean方法(initServletBean的init实现) 内部会调用refresh方法
        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
        // TOMCAT启动过程中会调用DispatcherServlet的init方法
        Wrapper mvc = tomcat.addServlet("/", "mvc", dispatcherServlet);
        mvc.setLoadOnStartup(1);
        mvc.addMapping("*.do");

        tomcat.start();
        tomcat.getServer().await();

    }
}
