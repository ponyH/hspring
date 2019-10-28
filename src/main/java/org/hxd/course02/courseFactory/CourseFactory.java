package org.hxd.course02.courseFactory;

import org.hxd.course02.common.Course;
import org.hxd.course02.common.JavaCourse;
import org.hxd.course02.common.PythonCourse;

public class CourseFactory {

    public static Course getCourse(String name){
        Course course = null;
        switch (name){
            case "java" :
                course = new JavaCourse();
                break;
            case "python" :
                course = new PythonCourse();
                break;
            default:
                System.out.println("类型不匹配");
                break;
        }
        return course;
    }
}