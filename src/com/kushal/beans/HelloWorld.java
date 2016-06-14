package com.kushal.beans;

import org.springframework.beans.factory.*;
public class HelloWorld implements InitializingBean, DisposableBean
{
	private String msg1;
	
	
	public String getMsg1() {
		return msg1;
	}


	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}

	public void display(String msg)
	{
		System.out.println(msg);
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void dest() {
		System.out.println("destroy");
	}
	 

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after properties set");
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("disposable destroy");
	}
}
