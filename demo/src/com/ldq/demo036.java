package com.ldq;

public class demo036 {

	public static void main(String[] args) {
		String stt = "cbsjhsjkssspllbjshsjdpllsbsjbsjsjpllcsknsknoplldwssdsdspll";
		String stttString = "pll";
		int count = Founding(stt, stttString);
		System.out.println(count);

	}

	public static int Founding(String a, String b) {
		int count = 0;
		if (!a.contains(b)) {
			return count;
		}
		int index = 0;
		System.out.println(a);
		while ((index = a.indexOf(b)) != -1) { // indexOf（）方法找到返回下标，找不到返回-1
			a = a.substring(index + b.length());
			// System.out.println(a);
			count++;
		}
		return count;

	}
}
