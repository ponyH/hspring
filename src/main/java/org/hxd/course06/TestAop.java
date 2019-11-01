package org.hxd.course06;

import org.springframework.stereotype.Service;

@Service
public class TestAop {

    public void add(){
        System.out.println("add方法执行了");
    }
}