package com.ldq;

public class demo045 {

	public static void main(String[] args) {
		int a = 6, b, b1, a1 = 6;
		b = a++;// 先a=a+1,然后再b=a
		b1 = ++a1;// 先b=a,然后再a=a+1
		System.out.println(b);
		System.out.println(b1);

	}

}
