package org.hxd.course01.entity;

import org.hxd.course02.common.Course;
import org.hxd.course02.common.JavaCourse;
import org.hxd.course02.common.PythonCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

    private Integer stuId;
    private String stuName;
    private String sex;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    // 学习java
    public void learnJava(){
        Course course = new JavaCourse();
        course.learn();
    }

    // 学习python
    public void learnPython(){
        Course course = new PythonCourse();
        course.learn();
    }

    // 学习任何课程
    public void leanAll(Course course){
        course.learn();
    }

    // IOC方式解耦
    public void learnByIoc(String name){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Course course = (Course) ac.getBean(name);
        course.learn();
    }
}