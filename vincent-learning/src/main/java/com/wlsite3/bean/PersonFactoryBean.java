package com.wlsite3.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PersonFactoryBean implements FactoryBean<Object> {
    @Override
    public Object getObject() throws Exception {
        return new PersonBean();
    }

    @Override
    public Class<?> getObjectType() {
        return PersonFactoryBean.class;
    }
}
