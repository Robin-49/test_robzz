package com.day3.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFullReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alis = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("how many elements want to enter");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements");
		
		for (int i=0; i<n;i++) {
			 int l = sc.nextInt();
			alis.add(l);
		}
		//System.out.println(alis);

		System.out.println("Enter Index and Value to to be Replaced");
		int index = sc.nextInt();
		int value =sc.nextInt();
				
		System.out.println("Before Replace operation");
		System.out.println(alis);
		alis.set(index, value);
		System.out.println("After Replace Operation");
		System.out.println(alis);
		
	}

}
