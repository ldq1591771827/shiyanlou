package com.ldq;

/***
 * ���ַ����������Ԫ��(ǰ�᣺����Ԫ�ر���������Ĳ���)
 * 
 * 
 * ***/
public class demo003 {

	public static void main(String[] args) {
		/*
		 * Random random = new Random();
		 * 
		 * Integer a[] = new Integer[10]; for (int i = 0; i < a.length; i++) {
		 * a[i] = random.nextInt(50); } System.out.print("ԭ��������Ϊ��"); for (int
		 * sun : a) { System.out.print(sun + " "); } System.out.println();
		 */

		int a[] = { 7, 5, 9, 6, 3, 2, 1, 8, 4 };
		int key = 5;
		int low = 0;
		int high = a.length - 1;
		int mid = 0;
		boolean pd = false;

		// ������ð������
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}

		}
		System.out.print("����������Ϊ��");
		for (int sun : a) {
			System.out.print(sun + " ");
		}
		System.out.println();
		if (key < a[low] || key > a[high]) {
			System.out.println("�Ҳ�����Ԫ�أ�����");
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
			System.out.println("��Ԫ�ص��±�Ϊ��" + mid);
		} else {
			System.out.println("�Ҳ�����Ԫ�أ�����");
		}
	}
}
