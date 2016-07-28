package com.anchorren.sort.SelectionSort;

import java.util.Arrays;

public class HeatSort {

	    public static void main(String[] args) {
	        int[] a={49,38,65,97,76,13,27,49,78,34,12,64};
	        System.out.println(Arrays.toString(a));
	        heapSort(a);
	        System.out.println(Arrays.toString(a));
	    }
	    
	    public static int[] heapSort(int[] nums){
	    	
	    	if(nums == null)
	    		return nums;
	    	int length = nums.length;
	    	for(int i = 0 ;i<length-1;i++){
	    		buildMaxHeap(nums, length - 1 - i);
	    		swap(nums,0,nums.length - 1 -i );
	    		System.out.println(Arrays.toString(nums));
	    	}
	    	return nums;
	    }
	    
	    //对data数组从0到lastIndex建大顶堆
	    public static void buildMaxHeap(int[] data, int lastIndex){
	          
	        for(int i=(lastIndex-1)/2;i>=0;i--){ //从lastIndex处节点（最后一个节点）的父节点开始
	            int k=i;
	            
	            while(k*2+1<=lastIndex){ //如果当前k节点的子节点存在  
	                //k节点的左子节点的索引 
	                int biggerIndex=2*k+1;
	                
	                if(biggerIndex<lastIndex){   //如果biggerIndex小于lastIndex，即biggerIndex+1代表的k节点的右子节点存在
	                    if(data[biggerIndex]<data[biggerIndex+1]){  
	                        biggerIndex++;  
	                    }  
	                }  
	                
	                if(data[k]<data[biggerIndex]){  //如果k节点的值小于其较大的子节点的值  
	                    swap(data,k,biggerIndex);  
	                    k=biggerIndex;  //将biggerIndex赋予k，开始while循环的下一次循环，重新保证k节点的值大于其左右子节点的值  
	                }else{  
	                    break;  
	                }  
	            }
	        }
	    }
	    //交换
	    private static void swap(int[] data, int i, int j) {  
	        int tmp=data[i];  
	        data[i]=data[j];  
	        data[j]=tmp;  
	    } 
}
