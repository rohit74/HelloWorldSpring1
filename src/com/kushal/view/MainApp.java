package com.kushal.view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.kushal.beans.HelloWorld;

public class MainApp 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloBean");
		System.out.println(obj1.getMsg1());
		((AbstractApplicationContext) context).registerShutdownHook();
		
		/*HelloWorld obj2 = (HelloWorld) context.getBean("helloBean");
		obj2.display(obj2.getMsg1());*/
		/*((AbstractApplicationContext) context).registerShutdownHook();*/
		
		/*HelloUS obj2 = (HelloUS) context.getBean("helloUS");
		System.out.println(obj2.getMsg1());
		System.out.println(obj2.getMsg2());*/
	}
}
