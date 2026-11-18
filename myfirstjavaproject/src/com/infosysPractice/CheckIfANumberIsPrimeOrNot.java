package com.infosysPractice;

public class CheckIfANumberIsPrimeOrNot {

	public static void main(String[] args) {
		
		int n = 5;
		boolean status = true;
		if(n<=1) {
			status = false;
		}else {
			
			for(int i = 2;i<n;i++) {
				if(n%i == 0) {
					status = false;
					break;
				}
			}
			
		}
		
		if(status) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
