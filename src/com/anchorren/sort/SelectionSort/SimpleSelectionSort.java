package com.anchorren.sort.SelectionSort;

import java.util.Arrays;
/**
 * 简单的选择排序
 * 
　　基本思想：
		在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
		然后在剩下的数当中再找最小的与第二个位置的数交换，
		如此循环到倒数第二个数和最后一个数比较为止。

 * @author REN
 */
public class SimpleSelectionSort {
	
	
	public static void main(String[] args) {
		int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
		System.out.println(Arrays.toString(a));
		int[] result = sort(a);
		System.out.println(Arrays.toString(result));
	}

	public static int[] sort(int[] nums){
		if(nums == null)
			return nums;
		for(int i = 0;i<nums.length;i++){
			int min = nums[i];
			int minIndex = i;
			for(int j = i;j<nums.length;j++){
				if(nums[j] < min){
					min = nums[j];
					minIndex = j;
				}
			}
			nums[minIndex] = nums[i];
			nums[i] = min;
		}
		return nums;
	}
}
