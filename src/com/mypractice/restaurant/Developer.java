package com.mypractice.restaurant;

import java.util.Random;

public class Developer extends Worker{

	

	public Developer(String name) {
		super(name);

	}

	@Override
	public double pay(int days) {
		Random random = new Random();
		double pay=( random.nextInt(90) + 10)*days;
		System.out.println("Developer payed: "+pay);
		return pay;
		
	}

}
