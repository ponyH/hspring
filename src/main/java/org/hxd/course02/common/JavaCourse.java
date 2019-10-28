package org.hxd.course02.common;

import org.hxd.course02.common.Course;

public class JavaCourse implements Course {

    @Override
    public void learn() {
        System.out.println("java");
    }
}