package com.infosysPractice;

public class FindMisiingNumber {

	public static void main(String[] args) {
		
		int arr[] = { 2,3, 4};
		
		int n = arr.length+1;
		int sum = n*(n+1)/2;
		int arraySum = 0;
		
		for(int i = 0;i<arr.length;i++) {
			
				arraySum += arr[i] ;
			
		}
		
		System.out.println("Missing Number: "+(sum - arraySum));
		
		
		

	}

}
