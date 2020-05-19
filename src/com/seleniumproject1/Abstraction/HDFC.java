package com.seleniumproject1.Abstraction;

public class HDFC extends RbiBank {
	@Override
	public void getintrestrate() {
		
		System.out.println("I am HDFC intrest rate");
		
	}
	

	public static void main(String[] args) {
		HDFC hdfc= new HDFC();
		
		hdfc.getintrestrate();
		
		PNB pnb= new PNB();
		
		pnb.getintrestrate();
		
		SBI sbi= new SBI();
		
		sbi.getintrestrate();
	}
}
