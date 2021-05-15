package com.liujf.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liujf.spring01.Configuration.TestConfig;

public class Main {

	public static void main(String[] args) {
		// ��xml�������õ�����
		ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		
		//��javaע��������м������õ�����
        ApplicationContext context2 = new AnnotationConfigApplicationContext(TestConfig.class);
	}
}
