package com.wlsite.test;

import com.wlsite.dao.CarDao1;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestCGLib {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CarDao1.class);
        enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
        enhancer.setCallback(new MethodInterceptor(){
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("method-");
                return methodProxy.invokeSuper(o, objects);
            }
        });
        CarDao1 carDao1 = (CarDao1)enhancer.create();
        carDao1.query();
    }
}
