package com.jizhong.controller;

public class TestException {
	public static void main(String[] args) {
		/**
		 * 在try块中，编写被0除的代码
		 * 在catch块中，捕获被0除所产生的异常，并且打印异常信息
		 * 在finally块中，打印“欢迎使用”
		 */
		
		try{
			int i = 100 / 0;
		}catch(ArithmeticException e){
			System.out.println("算术异常，打印异常信息：");
			e.printStackTrace();
		}finally {
			System.out.println("欢迎使用~~");
		}
	}
}
