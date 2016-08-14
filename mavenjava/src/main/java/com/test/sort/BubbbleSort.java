package com.test.sort;

public class BubbbleSort {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 9, 87, 34, 23, 233, 45, 234, 534, 32 };
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = 0;
					temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;

				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
