package com.ldq;

/*
 * ʹ��try��catch��finally�ؼ���ʹ�ó����쳣����������ȥ��
 * 
 * 
 * */
public class demo029 {

	public static void main(String[] args) {
		int a = 4, b = 2;
		try {
			int result = divide(a, b);
			System.out.println("a����b�Ľ��Ϊ" + result);
		} catch (Exception e) {

		} finally {
			System.out.println("������finally����飡����");
		}
		System.out.println("�������������ȥ������");

	}

	public static int divide(int a, int b) {

		int result = a / b;
		return result;
	}

}
