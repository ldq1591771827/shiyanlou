package com.ldq.transporting;

public class Ztransportation extends Transportation implements Careable {
	// �޲ι� �췽��
	public Ztransportation() {
		super();
	}

	// �вι��췽��:����š��ͺš�������
	public Ztransportation(String number, String model, String admin) {
		super(number, model, admin);
	}

	// ���䷽��
	public void transport() {
		System.out.println("��������У�����");
	}

	// ��д�����ı�������
	public void upkeep() {
		System.out.println("�������䳵��������ϣ�����");
	}

}
