package com.wlsite3.config;

import com.wlsite.config.TestImportBeanDefinitionRegister;
import org.springframework.context.annotation.*;

@ComponentScan(value = "com.wlsite3")
@Configuration
@EnableAspectJAutoProxy
@Import({CustomImportBeanDefinitionRegistrar.class})
//@ImportResource("game.xml")
public class CleanSpringConfig {

}