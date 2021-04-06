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
                System.out.println("postProcessAfterInitialization --> Illegal name for " + beanName + ", assigned by default");
                castedBean.setName("Unknown name");
            }
            if (castedBean.getValue() < 0) {
                System.out.println("postProcessAfterInitialization --> Illegal value for " + beanName + ", assigned by default");
                castedBean.setValue(0);
            }
        }
        return bean;
    }
}
