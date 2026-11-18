package com.infosysPractice;

public class NextGreaterElement {

	public static void main(String[] args) {
		int arr[] = {4, 5, 2, 10, 8};
		
		for(int i = 0;i<arr.length;i++) {
			boolean found = false;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]<arr[j] ){
					System.out.print(arr[j]+" ");
					found = true;
					
					break;
					
				}
			}
			
			if(!found) {
				System.out.print("-1");
			}
		}

	}

}
