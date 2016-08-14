package com.test.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private Lock lock = new ReentrantLock();
	private String username;
	private int fee = 0;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		lock.lock();
		this.fee = fee;
		System.out.println(Thread.currentThread().getName() + ":counter的余额："
				+ this.fee);
		lock.unlock();
	}

}
