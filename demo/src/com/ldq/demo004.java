package com.ldq;

import java.util.Random;
import java.util.Scanner;

public class demo004 {

	public static void main(String[] args) {
		// 1.ͨ��Random���е�nextInt��int n������������һ��0~9�������
		int randomNumber = new Random().nextInt(10);
		System.out.println("������Լ����ɣ�");
		// 2.����µ�����
		System.out.println("------���������µ����֣�-------");
		Scanner scanner = new Scanner(System.in);
		int enterNumber = scanner.nextInt();
		// 3.ͨ��whileѭ�������в����ֶԴ�
		while (enterNumber != randomNumber) {
			if (enterNumber > randomNumber) {
				System.out.println("������˼����´��ˣ�������ม���������");
			} else {
				System.out.println("������˼�����С�ˣ�������ม���������");
			}
			// ��������Ҫ�µ�����
			System.out.println("------���������µ����֣�-------");
			enterNumber = scanner.nextInt();

		}
		System.out.println("��ϲ�㣬�¶��ˣ�����");
	}

}
