package com.ldq;

public class Bank {
	static String bankName;
	private String name;// 储户姓名
	private String password;// 密码
	private double balance;// 账户余额
	private double turnover;// 交易额

	static void welcome() {
		System.out.println("欢迎来到" + bankName + "-----------");
	}

	public Bank(String name, String password, double turnover) {
		this.name = name;
		this.password = password;
		this.turnover = turnover;
		this.balance = turnover - 10;
		System.out.println(name + "开户成功，账户余额" + balance);

	}

	public void deposit(double turnover) {
		this.balance = this.balance + turnover;
		System.out.println(name + "您好，您的账户已存入" + turnover + "元，" + "当前余额为"
				+ balance + "元");
	}

	public void withdrawal(String passwordd, double turnover) {
		if (password != passwordd) {
			System.out.println("您输入的密码有误！");
			return;
		}
		if (balance - turnover > 0) {
			balance = balance - turnover;
			System.out.println(name + "您好，您的账户已取出" + turnover + "元，当前余额为"
					+ balance + "元");
		} else {
			System.out.println("对不起，账户余额不足！！！");
		}
	}

	static void welcomeNext() {
		System.out.println("请携带好随身物品，欢迎下次光临" + bankName + "-------------");
	}

}
