package org.hxd.course05.service.impl;

import org.hxd.course05.dao.StudentMapper;
import org.hxd.course05.entity.Student;
import org.hxd.course05.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    @Override
    public void addStudent() {
        Student student = new Student();
        studentMapper.addStudent(student);
    }
}