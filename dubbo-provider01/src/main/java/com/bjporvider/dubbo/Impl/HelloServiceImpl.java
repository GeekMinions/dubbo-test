package com.bjporvider.dubbo.Impl;

import com.bjporvider.dubbo.HelloService;

public class HelloServiceImpl implements HelloService{

	public String sayHello(String name) {
		return "Hello, " + name;
	}

}
