package com.ldq;

/*
 * ʵ�ֶ��߳�
 * 
 * */
public class demo044 {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		while (true) {
			System.out.println("main()����һֱ�����У�����");

		}

	}

}

class MyThread extends Thread {
	public void run() {
		while (true) {
			System.out.println("���췽���е��߳�һֱ�����У�����");
		}

	}
}
