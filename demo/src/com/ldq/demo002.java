package com.ldq;

import java.util.Random;

/***
 * ð������ķ���
 * 
 * 
 * 
 * ***/
public class demo002 {

	public static void main(String[] args) {
		Integer shuzu[] = new Integer[15];
		Random random = new Random();

		for (int i = 0; i < shuzu.length; i++) {
			shuzu[i] = random.nextInt(100);

		}
		System.out.print("ԭ��������Ϊ��");
		for (int sun : shuzu) {
			System.out.print(sun + " ");
		}
		for (int i = 0; i < shuzu.length - 1; i++) {
			for (int j = 0; j < shuzu.length - 1 - i; j++) {
				if (shuzu[j] > shuzu[j + 1]) {
					int temp = shuzu[j];
					shuzu[j] = shuzu[j + 1];
					shuzu[j + 1] = temp;
				}
			}

		}
		System.out.println();
		System.out.print("ð������������Ϊ��");
		for (int sun : shuzu) {
			System.out.print(sun + " ");
		}

	}

}
