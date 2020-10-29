package com.wlsite3.config;

import com.wlsite.util.LogUtil;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectConfig {
    @Pointcut("execution(public void com.wlsite3.service.*.*(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before(){
        LogUtil.info("BEFORE", this);
    }
}
