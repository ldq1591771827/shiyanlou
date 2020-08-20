package com.ldq;

/***
 * 将数组元素前后倒序的demo（改变原来数组的内容）
 * 
 * ***/
public class demo001 {

	public static void main(String[] args) {

		int[] arr = { 4, 8, 6, 7, 9, 1, 2, 3, 5 };
		System.out.print("替换前数组的内容为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}
		System.out.print("替换后数组的内容为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}
}
