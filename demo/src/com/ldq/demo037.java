package com.ldq;

import java.util.Properties;
import java.util.Set;

public class demo037 {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);

		Set<String> proSet = properties.stringPropertyNames();
		for (String key : proSet) {
			String valueString = System.getProperty(key);
			System.out.println(valueString);
		}

	}

}
