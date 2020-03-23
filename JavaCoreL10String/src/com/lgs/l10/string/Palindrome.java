package com.lgs.l10.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the word()palindrome");
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.next());
		boolean flag = false;
		
		if(s.length() != 5) {
			System.out.println("Error! Word " + s + " doesn't have 5 letters");
		} else {
			for(int i = 0; i <2; i++) {
				if(s.charAt(i) == s.charAt(s.length()-1-i)) {
					flag = true;					
				} else {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Word " + s + " is PALINDROME");
			}else {
				System.out.println("Error! Word " + s + " doesn't PALINDROME");
			}
		}
	}
}
