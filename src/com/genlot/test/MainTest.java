package com.genlot.test;

import com.genlot.test.iml.Helloimplements;

/**
 * @ClassName:MainTest
 * @Desciption: TODO
 * @Author: Wilson Chen
 * @Date: 2020/6/24
 * @Time: 21:36
 * @Version: 1.0
 */

public class MainTest {

	public static void main(String[] args) {
		Ihello ihello = new Helloimplements();
		ihello.sayGoodBye("yaoming");
		ihello.sayHello("yaoming");

	}
}
