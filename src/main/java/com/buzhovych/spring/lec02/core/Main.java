package com.buzhovych.spring.lec02.core;

import com.buzhovych.spring.lec02.core.beans.ParentBean;
import com.buzhovych.spring.lec02.core.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            if (context.getBean(beanDefinitionName) instanceof ParentBean) {
                ParentBean castedBean = (ParentBean) context.getBean(beanDefinitionName);
                System.out.printf("%s:%s --> ", castedBean.getName(), castedBean.getValue());
            }
            System.out.println(beanDefinitionName);
        }
    }

}
