package com.xdevsoftware;

import org.apache.commons.beanutils.BeanUtils;


public class Demo
{
	
	public static void main(final String[] args) throws Exception
	{
		new Thread(() -> System.out.println("Hello lambda")).start();
		System.out.println(BeanUtils.describe("Hello bean"));
	}
}
