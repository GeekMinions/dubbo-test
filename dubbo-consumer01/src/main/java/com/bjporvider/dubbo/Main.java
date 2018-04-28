package com.bjporvider.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		HelloService helloService = (HelloService)context.getBean("helloService");
		System.out.println(helloService.sayHello("张三"));
		
	}
}
