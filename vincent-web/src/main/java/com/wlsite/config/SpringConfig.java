package com.wlsite.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.wlsite.util.LogUtil;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@ComponentScan("com.wlsite")
@EnableWebMvc
public class SpringConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        LogUtil.info("configureMessageConverters", this);
        converters.add(new FastJsonHttpMessageConverter());
    }
}
