package com.ldq;

public class demo007 {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 6, 3, 9, 8 };
		// ����ı�������
		System.out.print("����ı�����");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		// ��������ֵ
		System.out.println("����������ֵΪ��" + getMax(arr));
		System.out.println("���������СֵΪ��" + getMin(arr));
		// ���������
		int[] arr1 = arr;
		maopaoSort(arr1);
		System.out.print("����ð�����������Ϊ��");
		printing(arr1);

	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void maopaoSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("��" + (i + 1) + "������������Ԫ��Ϊ");
			printing(arr);
		}

	}

	public static void printing(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
