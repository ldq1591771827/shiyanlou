package com.ldq;

public class demo035 {

	public static void main(String[] args) {
		String str = "itcast";
		System.out.println(str.replace("it", "cn.it"));
		String str1 = "   i t c a s t   ";
		System.out.println(str1.trim());
		System.out.println(str1.replace(" ", ""));

		String s1 = "String";
		String s2 = "Str";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s2 + "ing"));
		System.out.println(s1.startsWith("St"));
		System.out.println(s1.endsWith("ng"));
		s1 = "";
		System.out.println(s1.isEmpty());

		String string = "ÓðÃ«Çò-ÀºÇò-Æ¹ÅÒÇò";
		System.out.println(string.substring(4));
		System.out.println(string.substring(4, 6));
		String[] stringArray = string.split("-");
		for (String a : stringArray) {
			System.out.print(a + "  ");
		}

	}

}
