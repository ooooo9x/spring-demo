package com.liujf.spring01.service.impl;

import com.liujf.spring01.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello() {
        return "Hello World";
    }
}
