package com.day3.Collections;

import java.util.*;

public class MainAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 String to check: ");
		String s1=sc.next();
		String s2 = sc.next();
		if(s1.length()!=s2.length()) {
			System.out.println("The String you entered was Not an Anagram");
		}
		else {
			char[] str1 = new char[s1.length()];
			
			char[] str2 = new char[s2.length()];
			
			for(int i=0;i<s1.length(); i++) {
				str1[i] = s1.charAt(i);
			}
			for(int i=0;i<s2.length(); i++) {
				str2[i] = s2.charAt(i);
			}
			Arrays.sort(str1);
			Arrays.sort(str2);
			
			
			//for(int i=0;i<s1.length();i++) {
			
			boolean res= Arrays.equals(str1, str2);
			if(res) {
				System.out.println("The String you enterd was Anagram");
			}
			else {
				System.out.println("The String you entered was Not an Anagram");
			}
		}

	}

}
