package com.day3.Collections;

//import java.util.ArrayList;
import java.util.*;

public class MainmergeArrayList {
	public static void main(String[] args) {
		
		ArrayList arr1 = new ArrayList<>();
		ArrayList arr2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many elements want to enter in 1st Array");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements in 1st array");
		
		for (int i=0; i<n;i++) {
			 int l = sc.nextInt();
			arr1.add(l);
		}
			
		System.out.println("how many elements want to enter in 2nd Array");
		int n1 = sc.nextInt();
		System.out.println("Enter "+n1+" elements in 2nd array");
		
		for (int i=0; i<n;i++) {
			 int l1 = sc.nextInt();
			arr2.add(l1);
		}
			
		System.out.println("Before Appending "+arr1+arr2);
		arr1.addAll(arr2);
		System.out.println("After Appending: "+arr1);
	}

}
