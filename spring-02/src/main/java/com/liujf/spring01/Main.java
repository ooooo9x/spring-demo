package com.liujf.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liujf.spring01.Configuration.TestConfig;

public class Main {

	public static void main(String[] args) {
		// 从xml加载配置到容器
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		
		//从java注解的配置中加载配置到容器
        ApplicationContext context2 = new AnnotationConfigApplicationContext(TestConfig.class);
	}
}
