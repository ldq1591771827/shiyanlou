package com.ldq.computer;

public class Computer {
	private USB[] usbArr = new USB[4];

	public void add(USB usb) {
		for (int i = 0; i < usbArr.length - 1; i++) {
			if (usbArr[i] == null) {
				usbArr[i] = usb;// ʹ����ӵ����USB���еĹ��췽��
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
		System.out.println("����������ɹ�������");
	}

	public void powerOff() {
		for (int i = 0; i < usbArr.length; i++) {
			if (usbArr[i] != null) {
				usbArr[i].turnOff();
			}
		}
		System.out.println("������ػ��ɹ�������");
	}

}
