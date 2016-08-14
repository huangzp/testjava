package com.test.test;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.test.test.StringTest.A;
import com.test.xiushifu.Cat;

public class TestFloat {

	public TestFloat() {
		System.out.println("我是Testfloat");
	}

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.a = 2;
		Cat cat2 = new Cat();
		System.out.println("cat1.a=" + cat1.a);
		System.out.println("cat2.a=" + cat2.a);

	}
}
