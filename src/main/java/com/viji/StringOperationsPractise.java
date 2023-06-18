package com.viji;

public class StringOperationsPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		String s1 = "Hello";

//		No seperate memory location will be created for s and s1,
//		it has the same values

		String s3 = new String("Welcome");
		String s14 = new String("Welcome");

//		Eventhough they have the same values, memory locations wil be created 
//		because of the new 

		String course = ("Automation Testing Using Selenium");
		String[] splittedString = course.split("Testing");
		for (String a : splittedString) {
			System.out.println(a);
		}
		for (int i = 0; i < splittedString.length; i++) {
			System.out.println(splittedString[i]);
		}

		System.out.println("####");
		System.out.println(splittedString[1].trim());

//		for(int i=0;i<course.length();i++)
//		{
//			System.out.println(course.charAt(i));
//		}

		for (int j = course.length() - 1; j >= 0; j--) {
			System.out.println(course.charAt(j));
		}
	}

}
