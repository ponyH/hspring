package org.hxd.course01;

import org.hxd.course01.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Student student = (Student) ac.getBean("Student");
        System.out.println(student);
    }
}