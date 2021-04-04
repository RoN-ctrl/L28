package com.buzhovych.spring.lec01.core.other;

import com.buzhovych.spring.lec01.core.other.beans.OtherBeanA;
import com.buzhovych.spring.lec01.core.other.beans.OtherBeanB;
import com.buzhovych.spring.lec01.core.other.beans.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OtherBean {
    private OtherBeanA otherBeanA;
    private OtherBeanB otherBeanB;

    @Autowired
    @Qualifier(value = "otherBeanC")
    private OtherBeanC otherBeanC;

    public OtherBean(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    @Autowired
    public void setOtherBeanB(OtherBeanB otherBeanB) {
        this.otherBeanB = otherBeanB;
    }

    @Override
    public String toString() {
        return otherBeanA + " autowired, " +
                otherBeanB + " autowired, " +
                otherBeanC + " autowired.";
    }
}
