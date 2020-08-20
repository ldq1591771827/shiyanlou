package com.ldq.computer;

public class Computer {
	private USB[] usbArr = new USB[4];

	public void add(USB usb) {
		for (int i = 0; i < usbArr.length - 1; i++) {
			if (usbArr[i] == null) {
				usbArr[i] = usb;// 使数组拥有类USB所有的构造方法
				break;
			}
		}
	}

	public void powerOn() {
		for (int i = 0; i < usbArr.length; i++) {
			if (usbArr[i] == null) {
				usbArr[i].turnOn();
			}
		}
		System.out.println("计算机开机成功！！！");
	}

	public void powerOff() {
		for (int i = 0; i < usbArr.length; i++) {
			if (usbArr[i] != null) {
				usbArr[i].turnOff();
			}
		}
		System.out.println("计算机关机成功！！！");
	}

}
