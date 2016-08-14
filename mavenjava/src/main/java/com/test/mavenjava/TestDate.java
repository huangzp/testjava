package com.test.mavenjava;

import java.text.DateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("未格式化之前日期是" + date);
		DateFormat d1 = DateFormat.getDateInstance(); // 默认语言（汉语）下的默认风格（MEDIUM风格，比如：2008-6-16
														// 20:54:53）
		String str1 = d1.format(date);
		Date date2 = new Date(str1);
		System.out.println("日期是：" + date2);
	}
}
