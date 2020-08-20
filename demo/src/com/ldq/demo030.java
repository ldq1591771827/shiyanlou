package com.ldq;

public class demo030 {

	public static void main(String[] args) {
		int a = 4, b = 2;
		int result;
		try {
			result = divide(a, b);
			System.out.println("a除以b的结果为" + result);
		} catch (Exception e) {
			System.out.println("程序出错，异常为：" + e.getMessage());
		}

	}

	public static int divide(int a, int b) throws Exception {

		int result = a / b;
		return result;
	}

}
