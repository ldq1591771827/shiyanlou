package com.ldq;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class demo041 {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("D:\\images\\test.txt");
		int b = 0;
		while (true) {
			b = in.read();
			if (b == -1) {
				break;
			}
			System.out.println(b);
		}
		in.close();
		FileOutputStream ot = new FileOutputStream("D:\\images\\example.txt",
				true);
		String string = "hahahha";
		byte[] bb = string.getBytes();
		for (int i = 0; i < bb.length; i++) {
			ot.write(bb[i]);

		}
		ot.close();

	}

}
