package org.hxd.course03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Course course = (Course) ac.getBean("course");
        course.showInfo();

        IOCCollection ioc = (IOCCollection) ac.getBean("iocCollection");
        System.out.println(ioc);
    }
}