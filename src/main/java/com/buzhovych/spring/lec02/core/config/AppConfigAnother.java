package com.buzhovych.spring.lec02.core.config;

import com.buzhovych.spring.lec02.core.beans.BeanA;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BeanA.class})
public class AppConfigAnother {

}
