package com.buzhovych.spring.lec01.core.config;

import com.buzhovych.spring.lec01.core.beans3.BeanD;
import com.buzhovych.spring.lec01.core.beans3.BeanF;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.buzhovych.spring.lec01.core.beans2")
public class AppConfigB {

    @Bean
    public BeanD beanD() {
        return new BeanD("beanD");
    }

    @Bean
    public BeanF beanF() {
        return new BeanF("beanF");
    }

}
