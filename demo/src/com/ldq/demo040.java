package com.ldq;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class demo040 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("1", "JAVA");
		map.put("2", "Android");
		map.put("3", "Python");
		Set keySet = map.keySet();
		System.out.println(keySet);
		Iterator iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			Object value = map.get(key);
			System.out.println(key + ":" + value);

		}
		Collection values = map.values();
		Iterator iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			Object iiObject = iterator2.next();
			System.out.print(iiObject + "  ");
		}

		System.out.println();
		Properties p = new Properties();
		p.setProperty("Backgroup-color", "red");
		p.setProperty("Font-size", "14px");
		p.setProperty("Language", "chinese");
		Enumeration names = p.propertyNames();
		while (names.hasMoreElements()) {
			String key = (String) names.nextElement();
			String value = p.getProperty(key);
			System.out.println(key + " = " + value);

		}

	}

}
