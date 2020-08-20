package com.ldq;

/*
 * 使用try。catch。finally关键字使得出现异常继续运行下去！
 * 
 * 
 * */
public class demo029 {

	public static void main(String[] args) {
		int a = 4, b = 2;
		try {
			int result = divide(a, b);
			System.out.println("a除以b的结果为" + result);
		} catch (Exception e) {

		} finally {
			System.out.println("跑入了finally代码块！！！");
		}
		System.out.println("程序继续运行下去！！！");

	}

	public static int divide(int a, int b) {

		int result = a / b;
		return result;
	}

}
