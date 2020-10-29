package com.wlsite.anno;

import com.wlsite.config.MyImport;
import com.wlsite.config.TestImportBeanDefinitionRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Import({TestImportBeanDefinitionRegister.class})
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VincentScan {
}
