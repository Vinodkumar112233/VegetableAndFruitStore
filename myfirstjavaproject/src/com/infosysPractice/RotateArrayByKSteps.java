package com.infosysPractice;

public class RotateArrayByKSteps {
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int k = 3;
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start ++;
			end --;
		}
		
		start = 0;
		 end = k-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end --;
			
		}
		
		start = k;
		end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int n: arr) {
			System.out.print(n + " ");
		}
	}

}
