package com.anchorren.sort.ExchangeSort;

import java.util.Arrays;

public class PopSort {

	 public static void main(String[] args) {
	        int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
	        System.out.println(Arrays.toString(a));
	        sort(a);
	        System.out.println(Arrays.toString(a));
	    }
	
	public static int[] sort(int[] nums){
		if(nums == null)
			return nums;
		for(int i  = 0;i<nums.length ;i ++){
			for(int j = 0;j<nums.length - 1 - i;j++){
				if(nums[j] > nums[j+1]){
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
					
			}
		}
		return nums;
	}
}
