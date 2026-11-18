package com.infosysPractice;

public class PalindromeNumber {

    public static void main(String[] args) {

        int n = 123;

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int rem = n % 10;

            reverse = reverse * 10 + rem;

            n = n / 10;
        }

        System.out.println("Reverse: " + reverse);

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}