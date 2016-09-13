package com.anchorren.sort.InsertSort;

import java.util.Arrays;
/**
 * 基本思想：
 * 		二分法插入排序的思想和直接插入一样，只是找合适的插入位置的方式不同，
 * 		这里是按二分法找到合适的位置，可以减少比较的次数
 * @author REN
 */
public class BinaryInsert {
	public static void main(String[] args) {
		int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
		System.out.println(Arrays.toString(a));
		int[] result = sort(a);
		System.out.println(Arrays.toString(result));
	}
	public static int[] sort(int[] nums){
		
		if(nums == null)
			return nums;
		
		for(int i = 0;i< nums.length; i++){
			int temp = nums[i];
			int left = 0;
			int right = i - 1;
			int mid = 0;
			//通过二分查找，寻找到插入位置left
			while(left <= right){
				mid = (left + right)/2;
				if(temp < nums[mid]){
					right = mid - 1;
				}else{
					left = mid + 1;
				}
			}
			//要插入位置后面元素全部后移
			for(int j = i-1; j >= left ;j--){
				nums[j+1] = nums[j];
			}
			//插入
			if(left != i)
				nums[left] = temp;
		}
		return nums;
	}
}
