package com.test.sort;

public class QuickSort {

	public static void quickSort(int[] nums, int l, int r) {
		if (l < r) {
			int i = l;
			int j = r;
			int k = i;
			while (i < j) {
				while ((nums[k] <= nums[j]) && (i < j)) {
					j--;
				}
				if (nums[k] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[k];
					nums[k] = temp;
					k = j;
				}
				while (nums[k] >= nums[i] && (i < j)) {
					i++;
				}
				if (nums[k] < nums[i]) {
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
					k = i;
				}

			}
			quickSort(nums, l, k - 1);
			quickSort(nums, k + 1, r);
		}

	}

	public static void main(String[] args) {
		int[] nums = { 3, 2, 9, 87, 34, 23, 233, 45, 234, 534, 3, 32 };
		quickSort(nums, 0, nums.length - 1);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
