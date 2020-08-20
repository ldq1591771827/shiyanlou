package com.ldq;

import java.io.File;

public class demo042 {

	public static void main(String[] args) {
		File file = new File("D:\\images\\test.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.canRead() ? "文件可读" : "文件不可读");
		System.out.println(file.canWrite());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println(file.isDirectory());
		System.out.println(file.isAbsolute());
		System.out.println(file.lastModified());
		System.out.println(file.length());
		System.out.println(file.delete());

	}

}
