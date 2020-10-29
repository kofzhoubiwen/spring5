package com.wlsite.config;

import com.wlsite.anno.VincentSelect;
import com.wlsite.util.LogUtil;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactoryBean implements FactoryBean<Object>, InvocationHandler {

    Class<?> clazz;
    public MyFactoryBean(Class<?> clazz) {
        this.clazz = clazz;
    }
    @Override
    public Object getObject() {
        Object object = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz}, this);
        return object;
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LogUtil.info("GET OBJECT VIA FACTORY BEAN",this);
        Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(), String.class);
        VincentSelect vincentSelect = method1.getDeclaredAnnotation(VincentSelect.class);
        LogUtil.info(vincentSelect.value(), this);
        return null;
    }


}
