package com.ldq;

public class demo038 {

	public static void main(String[] args) {
		long starttime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 1000000000; i++) {
			sum++;

		}
		long endtime = System.currentTimeMillis();
		System.out.println(endtime - starttime);
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.availableProcessors());
		System.out.println(rt.freeMemory() / 1024 / 1024);
		System.out.println(rt.maxMemory() / 1024 / 1024);

	}
}
