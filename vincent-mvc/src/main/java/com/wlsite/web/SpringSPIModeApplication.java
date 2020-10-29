package com.wlsite.web;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class SpringSPIModeApplication {
    public static void main(String[] args) throws LifecycleException {
        File base = new File(System.getProperty("java.io.tmpdir"));
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);
        // addWebapp表示这是一个web项目
        // contextPath表示tomcat的访问路径
        // docBase表示项目的web目录
        // 此处不使用addWebapp(Springboot也是如此 TomcatServer)
         tomcat.addWebapp("/", base.getAbsolutePath());
//        tomcat.addContext("/", base.getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
