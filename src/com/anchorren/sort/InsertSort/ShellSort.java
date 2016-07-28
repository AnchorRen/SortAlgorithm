package com.anchorren.sort.InsertSort;

import java.util.Arrays;

/**
 * 基本思想：
 * 		先取一个小于n的整数d1作为第一个增量，把文件的全部记录分成d1个组。
 * 		所有距离为d1的倍数的记录放在同一个组中。先在各组内进行直接插入排序；
 * 		然后，取第二个增量d2<d1重复上述的分组和排序，直至所取的增量dt=1(dt<dt-l<…<d2<d1)，
 * 		即所有记录放在同一组中进行直接插入排序为止。该方法实质上是一种分组插入方法。
 * @author REN
 */
public class ShellSort {

	public static void main(String[] args) {
		//int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		//int[] a={2,1};
		int[] a = {1};
		System.out.println(Arrays.toString(a));
		int[] result = sort(a);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] sort(int[] nums){
		
		if(nums == null )
			return nums;
		
		int d = nums.length / 2;
		while(d > 0){
			for(int x = 0; x< d; x++){ //分组
				for(int i = x + d ;i<nums.length;i+=d){ //组内直接插入排序
					int temp = nums[i];
					int j;
					for(j = i-d; j>=0 && nums[j] > temp;j-=d){
						nums[j+d] = nums[j];
					}
					nums[j+d] = temp;
				}
			}
			d = d/2;
		}
		return nums;
	}
}
