package com.viji;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arraylist = new ArrayList<>();
		arraylist.add(1);
		arraylist.add(2);
		for (int a : arraylist) {
			if (a % 2 == 0) {
				System.out.println(a);
			} else {
				System.out.println(a + "is a odd number");
			}
		}
		System.out.println("*********");

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.contains(1));
		
		String[] name= {"viji","selva"};
		List<String> nameArrayList=Arrays.asList(name);
		System.out.println(nameArrayList.contains("viji"));
	}

}
