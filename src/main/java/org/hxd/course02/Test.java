package org.hxd.course02;

import org.hxd.course01.entity.Student;
import org.hxd.course02.common.Course;
import org.hxd.course02.courseFactory.CourseFactory;

public class Test {

    public static void main(String[] args) {
        iocLearn();
    }

    // 不解耦时
    public static void commonLearn(){
        Student student = new Student();
        student.learnJava();
        student.learnPython();
    }

    // 使用工厂方式解耦
    public static void factoryLearn(){
        Course course = CourseFactory.getCourse("java");
        Student student = new Student();
        student.leanAll(course);
    }

    // 使用IOC方式解耦
    public static void iocLearn(){
        Student student = new Student();
        student.learnByIoc("javaCourse");
    }
}