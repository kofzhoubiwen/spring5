package com.wlsite.config;

import com.wlsite.anno.VincentScan;
import com.wlsite.dao.CarDao1;
import com.wlsite.dao.CarDao2;
import com.wlsite.dao.ProductDaoImpl;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

//@Configuration("springConfigHello")
@ComponentScan(value = "com.wlsite", lazyInit = false)
@VincentScan
@Import(MyImport.class)
@Configuration // 该注解会进行CGLIB代理
@EnableAspectJAutoProxy
//@ImportResource(locations = "classpath:customConfig.xml")
public class SpringConfig {

    @Bean("dd1")
    public CarDao1 carDao1() {
        return new CarDao1();
    }

    @Bean("dd2")
    public CarDao2 carDao2() {
        carDao1();
        return new CarDao2();
    }


}