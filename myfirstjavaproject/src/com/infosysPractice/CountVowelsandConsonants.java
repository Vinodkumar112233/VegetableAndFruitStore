package com.infosysPractice;

public class CountVowelsandConsonants {

	public static void main(String[] args) {

		String str = "programming";

		int vowels_count = 0;
		int consonants_count = 0;

		for (int i = 0; i < str.length(); i++) {

			char ch = Character.toLowerCase(str.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels_count++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonants_count++;
			}

		}

		System.out.println(vowels_count);
		System.out.println(consonants_count);

	}

}
