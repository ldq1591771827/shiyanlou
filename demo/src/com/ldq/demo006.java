package com.ldq;

/***
 * ʵ�ַ���������(1.��������ͬ2.����������������Ͳ���ͬ)
 * 
 * **/
public class demo006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1, 2, 3));
		System.out.println(add(1, 2));
		System.out.println(add(0.1, 0.2));
		Object sum = new Object();
		sum = add(0.10, 0.20);
		System.out.println(sum + sum.getClass().getSimpleName());
		sum = add(0.11, 0.21);
		System.out.println(sum + sum.getClass().getSimpleName());

	}

	public static int add(int i, int j) {
		System.out.println("�������˵�һ������������");
		return i + j;
	}

	public static int add(int i, int j, int k) {
		System.out.println("�������˵ڶ�������������");
		return i + j + k;
	}

	public static double add(double i, double j) {
		System.out.println("�������˵���������������");
		return i + j;
	}

}
