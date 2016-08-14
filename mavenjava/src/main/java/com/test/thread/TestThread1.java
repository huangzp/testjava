package com.test.thread;

public class TestThread1 extends Thread {

	private Counter counter;

	public TestThread1() {

	}

	public TestThread1(Counter counter) {
		this.counter = counter;
	}

	public void run() {

		counter.setFee(counter.getFee() + 1);

	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Thread thread = new TestThread1(counter);
			thread.start();
		}

	}
}
