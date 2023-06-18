package com.viji;

public class IfElse {

	public static void main(String[] args) {

		int[] num= {1,2,3,4,5,6,7,8,9,10};
		for(int value:num)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
			else
			{
				System.out.println(value + " is an even number");
			}
		}
		
		int[] numbers = {10,11,2,3,4,5};
		
		for(int j=0;j<numbers.length;j++)
		{
			if(numbers[j]%2==0)
			{
				System.out.println(numbers[j]);
			}
		}
		
	}

}
