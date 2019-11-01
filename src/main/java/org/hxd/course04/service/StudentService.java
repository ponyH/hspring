package org.hxd.course04.service;

import org.hxd.course01.entity.Student;
import org.hxd.course04.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {

    @Resource(name = "sssDao")
    private StudentDao studentDao;

    public void addStudent(Student student){
        studentDao.addStudent(student);
    }
}