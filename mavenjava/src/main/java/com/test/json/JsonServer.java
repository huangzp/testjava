package com.test.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.test.entity.Cat;

public class JsonServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		Cat cat = new Cat();
		cat.setId(1);
		cat.setName("red");
		String g = gson.toJson(cat);
		System.out.println("输出：" + g);
		Cat cat1 = new Cat();
		cat1.setId(2);
		cat1.setName("yellow");
		List<Cat> list = new ArrayList<Cat>();
		list.add(cat);
		list.add(cat1);
		java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<List<Cat>>() {
		}.getType();
		String g2 = gson.toJson(list, type);
		System.out.println(g2);
		Map<String, String> map = new HashMap<String, String>();
		map.put("flag", "true");
		map.put("url", "123");
		String g3 = gson.toJson(map);
		System.out.println("map:" + g3);
		System.out.println("11");
	}

}
