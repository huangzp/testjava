package com.test.xiushifu;

public class Animal {

	static {
		System.out.println("我是动物");
	}
	{
		System.out.println("我是动物的方法块");
	}

	public Animal() {
		System.out.println("动物的构造器");
	}
}
