package com.mypractice.restaurant;

import java.util.Random;

public class Doctor extends Worker {

	

	public Doctor(String name) {
		super(name);
		
	}

	@Override
	public double pay(int days) {
		Random random = new Random();
		double pay=random.nextInt(1600) + 400;
		System.out.println("Doctor payed "+pay);
		return  pay;
	
	}

}
