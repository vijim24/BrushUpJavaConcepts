package com.viji;

public class MethodsPractise02 {

	public static void main(String[] args) {
		MethodsPractise02 d = new MethodsPractise02();
		String name = d.DemoMethod();
		System.out.println(name);
		MethodsPractise01 s = new MethodsPractise01();
		s.getData();
				
	}

	public String DemoMethod() {
		System.out.println("Hello World");
		return "Rahul";

	}
}
