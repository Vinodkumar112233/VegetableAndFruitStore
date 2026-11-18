package com.infosysPractice;

public class MaximumSubarray {

	public static void main(String[] args) {
		
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int currentSum = arr[0];
		int maxSum = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			
			maxSum = Math.max(currentSum, maxSum);
		}
		
		System.out.println("Maximum Subarray Sum: "+maxSum);
		

	}

}
