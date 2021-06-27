package com.liujf.spring02.service.impl;

import com.liujf.spring02.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello() {
        return "Hello World";
    }
}
