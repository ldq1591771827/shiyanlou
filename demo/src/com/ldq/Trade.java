package com.ldq;

/*
 * ģ�����д�ȡ���߼�ϵͳ
 * */
public class Trade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank.bankName = "��������";
		Bank.welcome();
		Bank bank = new Bank("С��", "123456", 100.0);
		bank.deposit(500.00);
		bank.withdrawal("123456", 1000.0);
		bank.withdrawal("654321", 200.0);
		bank.withdrawal("123456", 200.0);
		Bank.welcomeNext();

	}
}
