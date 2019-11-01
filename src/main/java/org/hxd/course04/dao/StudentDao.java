package org.hxd.course04.dao;

import org.hxd.course01.entity.Student;
import org.springframework.stereotype.Component;

@Component("sssDao")
public class StudentDao {

    public void addStudent(Student student){
        System.out.println("添加学生成功，学生信息是：" + student);
    }
}