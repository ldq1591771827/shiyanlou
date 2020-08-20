package com.ldq;

/*
 * 实现多线程
 * 
 * */
public class demo044 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		while (true) {
			System.out.println("main()方法一直在运行！！！");

		}

	}

}

class MyThread extends Thread {
	public void run() {
		while (true) {
			System.out.println("构造方法中的线程一直在运行！！！");
		}

	}
}
