package com.ldq;

public class demo039 {

	public static void main(String[] args) {
		int[] fromArray = { 101, 102, 103, 104, 105, 106 };
		int[] toArray = { 201, 202, 203, 204, 205, 206, 207 };
		System.arraycopy(fromArray, 2, toArray, 3, 4);
		for (int a : toArray) {
			System.out.println(a);
		}

	}

}
