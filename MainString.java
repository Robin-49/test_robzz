package com.day3.Collections;

import java.util.*;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lis = new LinkedList<>();
		Scanner sc =new Scanner(System.in);
		lis.add("hi");
		lis.add("hello");
		lis.add("welcome");
		System.out.println("Eneter the element to get append in LinkedList");
		for(int i=0; i<3;i++) {
			String data = sc.next();
			lis.add(data);
		}
		System.out.println(lis);
		
	}

}
