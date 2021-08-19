package com.day3.Collections;

import java.util.*;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> alis = new ArrayList<>();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("how many elements want to enter");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements");
		
		for (int i=0; i<n;i++) {
			String l = sc.next();
			alis.add(l);
		}
		Object[] stri =  alis.toArray();
		
		for (int i=0;i<n;i++) {
			System.out.println(i+" - "+stri[i]);
		}
						
	}

}
