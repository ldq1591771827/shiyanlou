package com.ldq;

public class demo030 {

	public static void main(String[] args) {
		int a = 4, b = 2;
		int result;
		try {
			result = divide(a, b);
			System.out.println("a����b�Ľ��Ϊ" + result);
		} catch (Exception e) {
			System.out.println("��������쳣Ϊ��" + e.getMessage());
		}

	}

	public static int divide(int a, int b) throws Exception {

		int result = a / b;
		return result;
	}

}
