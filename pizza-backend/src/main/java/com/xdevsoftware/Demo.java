package com.xdevsoftware;

public class Demo
{
	
	public static void main(final String[] args)
	{
		System.out.println("Hello world");
		new Thread(()-> System.out.println("Hello lambda")).start();
	}
	
}
