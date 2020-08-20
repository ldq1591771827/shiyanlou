package com.ldq;

public class XThread extends Thread {
	public void run() {
		int count = 0;
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < 500000000; i++) {
			// Thread.yield();
			count = count + (i + 1);
		}

		long finshTime = System.currentTimeMillis();
		System.out.println(finshTime - beginTime);
	}

	public static void main(String[] args) {
		XThread xThread = new XThread();
		// xThread.setDaemon(true);// 执行后无法让线程再Start起来
		System.out.println("00000");
		xThread.start();

	}

}
