package com.ldq;

/***
 * 二分法查找数组的元素(前提：数组元素必须是有序的才行)
 * 
 * 
 * ***/
public class demo003 {

	public static void main(String[] args) {
		/*
		 * Random random = new Random();
		 * 
		 * Integer a[] = new Integer[10]; for (int i = 0; i < a.length; i++) {
		 * a[i] = random.nextInt(50); } System.out.print("原来的数组为："); for (int
		 * sun : a) { System.out.print(sun + " "); } System.out.println();
		 */

		int a[] = { 7, 5, 9, 6, 3, 2, 1, 8, 4 };
		int key = 5;
		int low = 0;
		int high = a.length - 1;
		int mid = 0;
		boolean pd = false;

		// 先排序（冒泡排序）
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		System.out.print("排序后的数组为：");
		for (int sun : a) {
			System.out.print(sun + " ");
		}
		System.out.println();
		if (key < a[low] || key > a[high]) {
			System.out.println("找不到该元素！！！");
			return;
		}

		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] > key) {
				high = mid - 1;
			} else if (a[mid] < key) {
				low = mid + 1;
			} else {
				pd = true;
				break;
			}

		}
		if (pd == true) {
			System.out.println("该元素的下标为：" + mid);
		} else {
			System.out.println("找不到该元素！！！");
		}
	}
}
