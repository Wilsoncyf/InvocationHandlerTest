package com.genlot.test;

import com.genlot.test.iml.Helloimplements;

/**
 * @ClassName:StaticProxy
 * @Desciption: TODO
 * @Author: Wilson Chen
 * @Date: 2020/6/24
 * @Time: 23:37
 * @Version: 1.0
 */

public class StaticProxy implements Ihello {
	private Ihello ihello;

	public void setImpl(Ihello impl) {
		this.ihello = impl;
	}

	@Override
	public void sayHello(String name) {
		System.out.println("问候之前的日志记录。。。");
		ihello.sayHello(name);
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println("问候之前的日志记录。。。");
		ihello.sayGoodBye(name);
	}

	public static void main(String[] args) {
		Helloimplements helloimplements = new Helloimplements();
		StaticProxy proxy = new StaticProxy();
		proxy.setImpl(helloimplements);
		proxy.sayHello("wilson");

	}
}
