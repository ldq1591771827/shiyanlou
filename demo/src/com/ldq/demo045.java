package com.ldq;

public class demo045 {

	public static void main(String[] args) {
		int a = 6, b, b1, a1 = 6;
		b = a++;// ��a=a+1,Ȼ����b=a
		b1 = ++a1;// ��b=a,Ȼ����a=a+1
		System.out.println(b);
		System.out.println(b1);

	}

}
