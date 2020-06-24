package com.genlot.test.iml;

import com.genlot.test.Ihello;

/**
 * @ClassName:Helloimplements
 * @Desciption: TODO
 * @Author: Wilson Chen
 * @Date: 2020/6/24
 * @Time: 21:22
 * @Version: 1.0
 */

public class Helloimplements implements Ihello {

	@Override
	public void sayHello(String name) {
		System.out.println("问候之前的日志记录");
		System.out.println("Hello" + name);
	}

	@Override
	public void sayGoodBye(String name) {
		System.out.println("问候之前的日志记录");
		System.out.println(name + " GoodBye!");
	}
}
