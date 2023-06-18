package com.viji;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for integers
		int[] arr = {1,3,3,4,5};
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
//		for string
		
		String[] friends = {"viji","selva"};
		for (int i=0; i <friends.length;i++)
		{
			System.out.println(friends[i]);
		}
		
//		Enhanced for loop
		String[] names = {"vinayagar","hanuman"};
		for (String  s:names)
		{
			System.out.println(s);
		}
	}
	

}
