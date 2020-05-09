package com.seleniumproject1.Interface;

import com.seleniumproject1.Abstraction.HDFC;

public class Yamahooo implements Bike,Bike1  {


	@Override
	public void engine() {
		System.out.println(" Yamahoo engine ");
		
	}

	@Override
	public void breakshoe() {
		// TODO Auto-generated method stub
		System.out.println("Yamahoo Breakshoe");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Yamahoo Speed ");
	}

	@Override
	public void clutch() {
		// TODO Auto-generated method stub
		System.out.println("Yamahoo Clutch");
	}
	
	
	@Override
	public void fueltank() {
		// TODO Auto-generated method stub
		System.out.println("Yamahoo  fuel tank");
	}
	
	 public static void main(String[] args) {
		Bike bike;
		Bike1 bike1;
		
		
		bike= new Bajajj();
		
		bike.engine();
		bike.breakshoe();
		bike.speed();
		bike.clutch();
		
		bike= new HeroHonda();
		bike.engine();
		bike.breakshoe();
		bike.speed();
		bike.clutch();
		
		bike = new Yamahooo();
		bike1= new Yamahooo();
		bike.engine();
		bike.breakshoe();
		bike.speed();
		bike.clutch();
		bike1.fueltank();
		

	}

	

}
