package com.buzhovych.spring.core.config;

import com.buzhovych.spring.core.beans1.BeanA;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.buzhovych.spring.core.other")
public class OtherAppConfig {

}
