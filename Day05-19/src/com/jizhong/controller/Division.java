package com.jizhong.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入两个数字：");
		try{
			int d1 = scanner.nextInt();//第一个数字
			int d2 = scanner.nextInt();//第二个数字 输入异常
			int result = d1 / d2;//算数异常
			System.out.println("两个数字的结果为：" + result);
		}catch(ArithmeticException ex){//捕获算数异常
			System.out.println("算数异常，执行了不正常的算数表达式~~~");
			ex.printStackTrace();
		}catch(InputMismatchException e){//捕获输入异常
			System.out.println("输入数据不符合要求~~~");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("未知异常~~");
		}
		System.out.println("程序正常执行完毕~~~");
	}
}
