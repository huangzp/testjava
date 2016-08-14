package com.test.test;

public class StringTest {
	public static int i = 1;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		String tel = "";
		for (int i = 0; i < 4; i++) {
			tel += arr[i];
		}
		System.out.println("tel:" + tel);
	}

	static class A {
		public A() {
			System.out.println("我是testfloat里的A");
		}
	}
}
