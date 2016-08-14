package com.test.xiushifu;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FlowerCat extends Cat {

	static {
		System.out.println("子类的静态方法块");
	}

	public FlowerCat() {
		System.out.println("子类的构造方法");
	}

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("ab");
		set.add("a");
		set.add("dc");
		set.add("de");
		set.add("br");

		set.add("fe");
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);

		}

	}

	{
		System.out.println("子类的方法块");
	}
}
