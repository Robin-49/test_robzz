package com.day3.Collections;

import java.util.*;

public class ArrayIndexReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> ali = new ArrayList<>();
			ali.add(1);
			ali.add(9);
			ali.add(6);
			ali.add(8);
			ali.add(0);
			ali.add(10);
			
			System.out.println("Before Replace operation");
			System.out.println(ali);
			ali.set(4, 99);
			System.out.println("After Replace Operation");
			System.out.println(ali);
	}

}
