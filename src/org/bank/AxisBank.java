package org.bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("10%");
}
public static void main (String[] args) {
	AxisBank joe = new AxisBank();
	joe.deposit();
	joe.fixed();
	joe.saving();
}
}

