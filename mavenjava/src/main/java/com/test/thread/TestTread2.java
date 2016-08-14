package com.test.thread;

public class TestTread2 extends Thread{

	public int n;
	public Num num;
	public TestTread2(int n,Num num){
		this.num = num;
		this.n = n;
	}
	public void run(){
		while(n<=100){
			if(n-num.i==1){
				synchronized (num) {
					System.out.println(Thread.currentThread().getName()+":"+n);
					num.i=n;
					n+=2;
				}
			}
		}
	}
}
