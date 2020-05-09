package com.seleniumproject1.Encapsulation;

public class Encapsulation {
	
	private int accountnumber;
	
	private int ph;
	
	private String name;
	
	private String dob;
	
	
	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}


	public int getPh() {
		return ph;
	}


	public void setPh(int ph) {
		this.ph = ph;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public void BankManger() {
		Encapsulation encapsulation= new Encapsulation();
		
		encapsulation.setAccountnumber(100);
		
		encapsulation.setName("Ramesh");
		
		encapsulation.setPh(9999999);

	}
	
	
	public static void main(String[] args) {
		
		Encapsulation encapsulation= new Encapsulation();
		
		encapsulation.BankManger();
	}

}
