package com.ldq;

public class demo034 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.append("abcdef"));
		System.out.println(sb.insert(2, "123"));
		System.out.println(sb.delete(2, 5));
		System.out.println(sb.deleteCharAt(5));
		System.out.println("Çå¿Õ»º´æÇøÎª£º" + sb.delete(0, sb.length()));
		sb.append("abcdef");
		sb.setCharAt(1, 'p');
		System.out.println(sb);
		System.out.println(sb.replace(2, 4, "pp"));
		System.out.println(sb.reverse());

	}

}
