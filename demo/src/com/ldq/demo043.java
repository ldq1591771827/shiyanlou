package com.ldq;

import java.io.File;

public class demo043 {

	public static void main(String[] args) {
		File file = new File("D:\\wenjian");
		if (file.isDirectory()) {
			String[] nameStrings = file.list();
			for (String a : nameStrings) {
				System.out.println(a);
			}
		}
	}

}
