package com.wlsite.dao;

import com.wlsite.util.LogUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository("userDaoImplHello")
public class UserDaoImpl implements UserDao, ApplicationContextAware {

    ApplicationContext applicationContext;

    public UserDaoImpl() {
        LogUtil.info("Constructor", this);
    }

    @PostConstruct
    public void init() {
        LogUtil.info("@PostConstruct", this);
    }

    @Override
    public void query() {
        UserDao bean = applicationContext.getBean(UserDao.class);
        LogUtil.info("HASHCODE: " + bean.hashCode(), this);
        LogUtil.info("query", this);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
