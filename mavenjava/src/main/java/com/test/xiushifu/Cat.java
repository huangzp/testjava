package com.test.xiushifu;

public class Cat extends Animal {

	public static int a = 1;

	private String name;
	static {
		System.out.println("父类的静态方法块");
	}
	{
		System.out.println("父类的方法块");
	}

	public Cat() {
		System.out.println("父类的构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public final void sayHello() {
		System.out.println("喵喵");
	}
}
