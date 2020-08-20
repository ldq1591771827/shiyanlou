package com.ldq.transporting;

public class Ztransportation extends Transportation implements Careable {
	// 无参构 造方法
	public Ztransportation() {
		super();
	}

	// 有参构造方法:车编号、型号、负责人
	public Ztransportation(String number, String model, String admin) {
		super(number, model, admin);
	}

	// 运输方法
	public void transport() {
		System.out.println("运输进行中！！！");
	}

	// 重写车辆的保养方法
	public void upkeep() {
		System.out.println("货物运输车辆保养完毕！！！");
	}

}
