package com.anchorren.sort.InsertSort;

import java.util.Arrays;
/**
 * 直接插入排序
 * 	
 * 基本思想：
	 * 每步将一个待排序的记录，
	 * 按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），
	 * 直到全部插入排序完为止。
 * @author REN
 */
public class DirectInsertSort {
	
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		//int [] a = null;
		//int [] a = {};
		System.out.println(Arrays.toString(a));
		int[] result = sort(a);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] sort(int[] nums){
		
		if(nums == null)
			return nums;
		
		for(int i = 1;i<nums.length;i++){
			
			int temp = nums[i];
			int j;
			for(j = i-1;j>=0 && nums[j] > temp;j--){
					nums[j + 1] = nums[j];
			}
			nums[j+1] = temp;
		}
		return nums;
	}
}
