package org.hxd;

import org.hxd.course01.entity.Student;
import org.hxd.course02.common.Course;
import org.hxd.course02.courseFactory.CourseFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Student stu = (Student) ac.getBean("student");
        System.out.println(stu);

        learn();
    }

    // 未解耦时
    public static void learn(){
        Student student = new Student();
        student.learnJava();
        student.learnPython();
    }

    // 工厂方式解耦
    public static void learnAll(){
        Course course = CourseFactory.getCourse("java");
        Student student = new Student();
        student.leanAll(course);
    }
}
