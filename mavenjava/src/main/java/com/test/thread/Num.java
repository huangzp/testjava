package com.test.thread;

public class Num {

	public int i=0;
	
	public static void main(String[] args) {
		Num num = new Num();
		Thread thread1 = new TestTread2(1, num);
		Thread thread2 = new TestTread2(2, num);
		thread1.start();
		thread2.start();
	}
}
