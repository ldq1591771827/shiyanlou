package com.ldq.transporting;

public class TestTransporting {

	public static void main(String[] args) {
		SendTask task = new SendTask("UJGL60561161", 76.34);
		task.sendBefore();
		System.out.println("==================");
		Ztransportation t = new Ztransportation("Z025", "±¼³Û", "Ð¡¹þÅ·Åµ¸ö");
		Phone p = new Phone();
		task.send(t, p);
		System.out.println("==================");
		task.sendAfter(t);
		t.upkeep();

	}

}
