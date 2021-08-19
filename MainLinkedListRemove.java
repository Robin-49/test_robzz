package com.day3.Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class MainLinkedListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lis = new LinkedList<>();
		Scanner sc =new Scanner(System.in);
		lis.add("hi");
		lis.add("hello");
		lis.add("welcome");
		System.out.println("Size of LinkedList before Removed element: "+lis.size());
		
		/*for(int i=0; i<lis.size();i++) {
			lis.remove(i);
		}*/
		lis.clear();
		
		System.out.println("Size of LinkedList After Removed element: "+lis.size());
		//System.out.println(lis);
	}

}
