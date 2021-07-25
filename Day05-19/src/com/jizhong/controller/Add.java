package com.jizhong.controller;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个数字：");
		
		//有可能会报异常的代码
		//1. 执行可能出现错误的代码
		try{
			double d1 = scanner.nextDouble();//第一个数字
			double d2 = scanner.nextDouble();//第二个数字
			double result = d1 + d2;
			System.out.println("两个数字的结果为：" + result);
		//2. 捕获try代码块异常，并且处理异常
		}catch(ArithmeticException ex){//捕获异常 处理异常
			System.out.println("出现异常了，请处理异常~~~");
			ex.printStackTrace();//打印栈堆信息
		//判断catch是否捕获到异常：如果捕获到异常则先执行catch代码块，反之则先执行finally代码块
		}finally{
			System.out.println("Finally代码块执行了~~~");
		}
		//3. 异常处理完毕，程序正常运行
		System.out.println("程序正常执行完毕~~~");
		
		
	}
}
