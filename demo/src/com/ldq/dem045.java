package com.ldq;

public class dem045 {

	public static void main(String[] args) {
		new MyThreadd().start();
		new MyThreadd().start();
		new MyThreadd().start();
		new MyThreadd().start();
		new MyThreadd().start();

	}

}

class MyThreadd extends Thread {
	private int tickets = 100;

	public void run() {
		while (true) {
			if (tickets > 0) {
				Thread ttThread = Thread.currentThread();
				String ttThreadName = ttThread.getName();
				System.out.println("�߳�����Ϊ" + ttThreadName + "���ڴ�ӡ��" + tickets--
						+ "��Ʊ������");

			}

		}

	}

}