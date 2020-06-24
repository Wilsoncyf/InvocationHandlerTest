package com.genlot.test;

import com.genlot.test.iml.Helloimplements;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName:DynaProxyHello
 * @Desciption: TODO
 * @Author: Wilson Chen
 * @Date: 2020/6/25
 * @Time: 0:09
 * @Version: 1.0
 */

public class DynaProxyHello implements InvocationHandler {
	private Object delegate;

	public Object bind(Object delegate) {
		this.delegate = delegate;
		return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),this.delegate.getClass().getInterfaces(),this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		String name = method.getName();
		System.out.println("方法名为：" + name);
		if (name.equals("sayHello")) {
			System.out.println("日志记录策略A》》》");
		} else if (name.equals("sayGoodBye")) {
			System.out.println("日志记录B...");
		}
		result = method.invoke(this.delegate, args);

		return result;
	}

	public static void main(String[] args) {
		DynaProxyHello helloproxy = new DynaProxyHello();
		Helloimplements hello = new Helloimplements();
		Ihello ihello = (Ihello) helloproxy.bind(hello);
		ihello.sayHello("wilson");
		ihello.sayGoodBye("周揭露");
	}

}
