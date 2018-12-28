package com.test.service.demo.impl;

import org.springframework.stereotype.Service;

import com.test.service.demo.DemoService;

/**
 * Created by Administrator on 2018/2/1.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {


    public String sayHello(String word) {
        return "hello " + word + ",I'm provider \r\n";
    }
}
