package com.LabPractice;

//1.You are given an integer array where each element represents the height of a vertical line. The distance between two consecutive lines is 1 unit.
//Find two lines that, together with the X-axis, form a container that can store the maximum amount of water.
//Write a Java program to find the maximum water that can be stored.
//
//Example 1
//Input:
//int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//Output:
//49

public class Testdemo3 {

	public static void main(String[] args) {
		int[] a = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		
		
		
		int left = 0;
		int right = a.length - 1;
		int maxWater = 0;

		while (left < right) {

		    int width = right - left;

		    int height = Math.min(a[left], a[right]);

		    int area = width * height;

		    if (area > maxWater) {
		        maxWater = area;
		    }

		    if (a[left] < a[right]) {
		        left++;
		    } else {
		        right--;
		    }
		}
		System.out.println(maxWater);
	}

}
