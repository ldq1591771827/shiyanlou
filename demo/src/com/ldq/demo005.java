package com.ldq;

import java.util.Random;

/*
 * �������������һ�����δ�ӡ
 * */
public class demo005 {
	public static void method(int i, int j) {
		for (int m = 0; m < i; m++) {
			for (int n = 0; n < j; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomNumber = new Random();
		int i = randomNumber.nextInt(10);
		int j = randomNumber.nextInt(10);
		System.out.println("������ɵ���������Ϊ��" + i + "," + j);
		method(i, j);

	}

}
