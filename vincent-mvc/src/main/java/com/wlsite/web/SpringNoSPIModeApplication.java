package com.wlsite.web;

import com.wlsite.config.SpringConfig;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class SpringNoSPIModeApplication {
    public static void main(String[] args) throws LifecycleException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringConfig.class);
        context.refresh();

        File base = new File(System.getProperty("java.io.tmpdir"));
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9090);

        Context rootContext = tomcat.addContext("/", base.getAbsolutePath());

        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        Tomcat.addServlet(rootContext, "helloSpringBoot", dispatcherServlet).setLoadOnStartup(1);

        tomcat.start();
        tomcat.getServer().await();
    }
}
