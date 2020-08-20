package com.ldq;

public class demo033 {

	public static void main(String[] args) {
		String str = "abcd";
		char[] charArray = str.toCharArray();// 将字符串转换成数组
		for (int i = 0; i < charArray.length; i++) {
			if (i != charArray.length - 1) {
				System.out.print(charArray[i] + ",");
			} else {
				System.out.println(charArray[i]);
			}
		}
		System.out.println(str.toUpperCase());
		Object jj = new Object();
		jj = String.valueOf(12);
		System.out.println(jj.getClass().getSimpleName());

	}

}
