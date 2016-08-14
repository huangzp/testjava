package com.test.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumberUtils {

	public int[] compute1(int[] array,int target){
		int i = 0;
		int j = array.length-1;
		int[] indexs = new int[2];
		while(i<j){
			if(array[i]+array[j]>target){
				j--;
			}
			if(array[i]+array[j]==target){
				indexs[0] = i;
				indexs[1] = j;
				return indexs;
			}
			if(array[i]+array[j]<target){
				i++;
			}
		}
		if(indexs[0]==0&&indexs[1]==0){
			System.out.println("没有找到符合条件的两个数");
		}
		return indexs;
	}
	public int[] compute2(int[] array,int target){
		int[] newints = new int[1000];
		int[] indexs = new int[2];
		for (int i = 0; i < newints.length; i++) {
			newints[i] = -1;
		}
		for (int i = 0; i < array.length; i++) {
			newints[array[i]]=i;
		}
		double t = target/2.0;
		int i = 1 ;
		
		while(i<t){
			if((newints[(int) (t-i+0.6)]!=-1)&&(newints[(int) (t+i)]!=-1)){
				indexs[0] = newints[(int) (t-i+0.6)];
				indexs[1] = newints[(int) (t+i)];
				return indexs;
			}
			i++;
		}
		
		return null;
	}
	public int[] compute3(int[] array,int target){
		int[] indexs = new int[2];
		Map map = new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++){
			map.put(array[i], i);
		}
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int key = (int) entry.getKey();
			if(map.get(target-key)!=null){
				indexs[0] = (int) map.get(key);
				indexs[1] = (int) map.get(target-key);
				return indexs;
			}			
		}	
		return null;
	}
	public static void main(String[] args) {
		NumberUtils nu = new NumberUtils();
		
		int[] array ={7,8,6,3,2};
		int target = 5 ;
		int[] indexs = nu.compute3(array, target);
		if(indexs!=null){
			System.out.println("两个符合条件的数的下标是："+indexs[0]+"和"+indexs[1]);
		}else{
			System.out.println("没有找到");
		}
		
	
		
		
	}
}
