package com.ldq;

public class Bank {
	static String bankName;
	private String name;// ��������
	private String password;// ����
	private double balance;// �˻����
	private double turnover;// ���׶�

	static void welcome() {
		System.out.println("��ӭ����" + bankName + "-----------");
	}

	public Bank(String name, String password, double turnover) {
		this.name = name;
		this.password = password;
		this.turnover = turnover;
		this.balance = turnover - 10;
		System.out.println(name + "�����ɹ����˻����" + balance);

	}

	public void deposit(double turnover) {
		this.balance = this.balance + turnover;
		System.out.println(name + "���ã������˻��Ѵ���" + turnover + "Ԫ��" + "��ǰ���Ϊ"
				+ balance + "Ԫ");
	}

	public void withdrawal(String passwordd, double turnover) {
		if (password != passwordd) {
			System.out.println("���������������");
			return;
		}
		if (balance - turnover > 0) {
			balance = balance - turnover;
			System.out.println(name + "���ã������˻���ȡ��" + turnover + "Ԫ����ǰ���Ϊ"
					+ balance + "Ԫ");
		} else {
			System.out.println("�Բ����˻����㣡����");
		}
	}

	static void welcomeNext() {
		System.out.println("��Я����������Ʒ����ӭ�´ι���" + bankName + "-------------");
	}

}
