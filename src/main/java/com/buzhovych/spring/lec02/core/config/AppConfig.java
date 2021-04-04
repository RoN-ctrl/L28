package com.buzhovych.spring.lec02.core.config;

import com.buzhovych.spring.lec02.core.beans.BeanB;
import com.buzhovych.spring.lec02.core.beans.BeanC;
import com.buzhovych.spring.lec02.core.beans.BeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;

@Configuration
@Import({AppConfigAnother.class})
public class AppConfig {

    @Bean(initMethod = "customInit",
            destroyMethod = "customDestroy")
    @DependsOn("beanD")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(initMethod = "customInit",
            destroyMethod = "customDestroy")
    @DependsOn("beanB")
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean(initMethod = "customInit",
            destroyMethod = "customDestroy")
    public BeanD beanD() {
        return new BeanD();
    }

}
