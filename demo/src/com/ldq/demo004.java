package com.ldq;

import java.util.Random;
import java.util.Scanner;

public class demo004 {

	public static void main(String[] args) {
		// 1.通过Random类中的nextInt（int n）方法，生成一个0~9的随机数
		int randomNumber = new Random().nextInt(10);
		System.out.println("随机数以及生成！");
		// 2.输入猜的数字
		System.out.println("------请输入您猜的数字：-------");
		Scanner scanner = new Scanner(System.in);
		int enterNumber = scanner.nextInt();
		// 3.通过while循环，进行猜数字对错
		while (enterNumber != randomNumber) {
			if (enterNumber > randomNumber) {
				System.out.println("不好意思，你猜大了，继续猜喔》》》》》");
			} else {
				System.out.println("不好意思，你猜小了，继续猜喔》》》》》");
			}
			// 继续输入要猜的数字
			System.out.println("------请输入您猜的数字：-------");
			enterNumber = scanner.nextInt();

		}
		System.out.println("恭喜你，猜对了！！！");
	}

}
