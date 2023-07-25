package org.bank;

public class BankInfo extends AxisBank {

	public void saving() {
		System.out.println("Fill withdrawal form");
	}
	public void fixed() {
		System.out.println("Fill closing form");
	}
	public static void main(String[] args) {
		BankInfo bi= new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit();
	}
}
