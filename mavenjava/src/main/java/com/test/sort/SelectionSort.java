package com.test.sort;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 9, 87, 34, 23, 233, 45, 234, 534, 32 };
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = 0;
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}

			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
