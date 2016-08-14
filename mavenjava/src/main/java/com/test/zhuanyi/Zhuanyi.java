package com.test.zhuanyi;

public class Zhuanyi {

	public static void main(String[] args) {
//		String string = "\t黄壮鹏\"\\\\";
//		System.out.println(string);
//		String string2 = "\\*";
//		String[] strs = "jkjik*kkkk".split(string2);
//		for (int i = 0; i < strs.length; i++) {
//			System.out.println("第"+i+"个："+strs[i]);
//		}
//		
		
		
		String string3 = "黄壮";
		String s = string3.replaceAll("\\\\", "");
		System.out.println("string3:"+s);
		
		
		
		
	}
}
