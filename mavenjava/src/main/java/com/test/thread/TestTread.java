package com.test.thread;

public class TestTread {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				Count count = new Count();
				System.out.println("count的地址：" + count.toString());
				count.count();
			}
		};
		for (int i = 0; i < 10; i++) {
			new Thread(runnable).start();
		}
	}
}
