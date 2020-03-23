package com.lgs.l10.string;

import java.util.Scanner;

public class Replacement {

	public static void main(String[] args) {
		System.out.println("Enter the word: ");
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.next());
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' ||
					s.charAt(i) == 'o' || s.charAt(i) == 'u') {
						s = s.replace(s.charAt(i), '-');
					}
		}
		System.out.println("the word: " + s);

	}

}
