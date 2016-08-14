package com.test.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TestCat extends BigCat{

	public String two;
	public TestCat(){
		System.out.println("bigcat");
	}
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchFieldException {
		Class<?> demo = null;
		try {
			demo = Class.forName("com.test.test.SmallCat");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SmallCat sCat = (SmallCat) demo.newInstance();
	
		try {		
			Field field1 = demo.getDeclaredField("num");
			field1.setAccessible(true);
			field1.set(sCat, "2");
			System.out.println("scat.num="+sCat.getNum());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
