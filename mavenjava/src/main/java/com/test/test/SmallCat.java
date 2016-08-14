package com.test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.test.thread.Num;
import com.test.xiushifu.Cat;

public class SmallCat extends Cat {
	private String num ;
	private int num1;
	public void say() {
		sayHello();
	}
	public String getNum(){
		return num;
	}
	public void say(String str){
		System.out.println("smallcat say "+str);
	}
	public void edit(Num num){
		num.i=20;
		num = new Num();
		num.i=30;
		
		
	}
	public static void main(String[] args) {
//		Num num = new Num();
//		num.i=10;
//		SmallCat sCat = new SmallCat();
//		sCat.edit(num);
//		System.out.println("num.i:"+num.i);
//		int[] a = {
//				1,2,3,4,5,6
//		};
//		int[] b = Arrays.copyOf(a, 5);
//		List list = new ArrayList<String>();
//		System.out.println("a的地址："+a.toString());
//		System.out.println("b的地址："+b.toString());
		Map map = new HashMap<String, String>();
		map.put("1", "one");
		map.put("1", "one1");
		map.put("1", "one2");
		map.put("1", "one3");
		map.put("1", "one4");
		map.put("1", "one5");
		System.out.println("1--->"+map.get("1"));
		
		
		
	}
}
