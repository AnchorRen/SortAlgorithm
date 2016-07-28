package com.anchorren.sort.ExchangeSort;

import java.util.Arrays;
/**
 * 
 * 基本思想：
 * 
 * 		选择一个基准元素,通常选择第一个元素或者最后一个元素,
 *		 通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,
 * 		一部分大于等于基准元素,此时基准元素在其排好序后的正确位置,
 * 		然后再用同样的方法递归地排序划分的两部分。
 * 
 * @author REN
 */
public class QuickSort {
	
	
	 public static void main(String[] args) {
	        int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
	        System.out.println(Arrays.toString(a));
	        sort(a);
	        System.out.println(Arrays.toString(a));
	    }

	 public static void sort(int[] nums){
		 if(nums.length > 0){
			 quickSort(nums, 0, nums.length-1);
		 }
	 }
	 
	private static void quickSort(int[] nums,int low, int high){
		if(low < high){
			int middle = getMiddle(nums, low, high); //找到正确位置
			quickSort(nums, low, middle-1); //对正确位置前后连段分别进行快排
			quickSort(nums, middle + 1, high);
		}
	}
	
	/*
	 * 每次从拿出未排序首元素作为基准元素，通过前后遍历，交换，最后基准元素在其正确的位置上。返回其所在索引
	 */
	private static int getMiddle(int[] nums,int low,int high){
		int temp = nums[low]; //把第一个作为基准元素
		while(low < high){
			while(low < high && nums[high] >= temp){
				high --;
			}//找到从右侧开始比基准元素小的，交换
			nums[low] = nums[high];
			while(low < high && nums[low] <= temp){
				low ++;
			} //从左侧开始找到比基准元素大的，交换
			nums[high] = nums[low];
		}
		nums[low] = temp; //最后位置为基准元素的正确位置前面的都基准元素小，后面的都比基准元素大
		
		return low; 
	}
}
