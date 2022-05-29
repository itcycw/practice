package com.awei.test.gupao.design.delegate.simple;

import java.util.HashMap;

/**
 * @author cw
 */
public class Leader {

    private HashMap<String ,Iemployee> map = new HashMap<String,Iemployee>(){{
        put("编程",new EmployeeB());
        put("作图",new EmployeeA());

    }};

    public void doing(String task) {
        if(!map.containsKey(task)){
            System.out.println("我暂时还不会做这个事情");
        }else {
            map.get(task).doing(task);
        }
    }
}
