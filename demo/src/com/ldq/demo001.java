package com.ldq;

/***
 * ������Ԫ��ǰ�����demo���ı�ԭ����������ݣ�
 * 
 * ***/
public class demo001 {

	public static void main(String[] args) {

		int[] arr = { 4, 8, 6, 7, 9, 1, 2, 3, 5 };
		System.out.print("�滻ǰ���������Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();

		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}
		System.out.print("�滻�����������Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}
}
