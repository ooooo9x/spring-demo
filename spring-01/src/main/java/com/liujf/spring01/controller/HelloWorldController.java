package com.liujf.spring01.controller;

import com.liujf.spring01.service.HelloWorldService;

public class HelloWorldController {
	private HelloWorldService helloWorldService;

	public String hello() {
		return helloWorldService.hello();
	}
}
