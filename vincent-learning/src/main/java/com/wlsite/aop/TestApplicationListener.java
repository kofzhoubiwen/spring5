package com.wlsite.aop;

import com.wlsite.util.LogUtil;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestApplicationListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        LogUtil.info("BEAN初始化完成 接下来进行一些特定任务的检查或数据库的初始化", this);
    }
}
