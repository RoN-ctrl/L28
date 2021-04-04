package com.buzhovych.spring.lec01.core.config;

import com.buzhovych.spring.lec01.core.beans1.BeanA;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BeanA.class})
public class AppConfigA {

}
