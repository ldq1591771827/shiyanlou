package com.ldq;

public class demo007 {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 6, 3, 9, 8 };
		// 数组的遍历操作
		System.out.print("数组的遍历：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		// 数组求最值
		System.out.println("该数组的最大值为：" + getMax(arr));
		System.out.println("该数组的最小值为：" + getMin(arr));
		// 数组的排序
		int[] arr1 = arr;
		maopaoSort(arr1);
		System.out.print("经过冒泡排序后，数组为：");
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
			System.out.print("第" + (i + 1) + "轮排序结束后的元素为");
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
