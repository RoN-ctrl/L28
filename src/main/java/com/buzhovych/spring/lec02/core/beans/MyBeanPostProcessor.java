package com.buzhovych.spring.lec02.core.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor was created");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ParentBean) {
            ParentBean castedBean = (ParentBean) bean;
            if (castedBean.getName() == null) {
                castedBean.setName("Unknown name");
            }
            if (castedBean.getValue() < 0) {
                castedBean.setValue(0);
            }
        }
        return bean;
    }
}
