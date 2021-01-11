package com.mypractice.restaurant;

import java.util.Random;

public class Developer extends Worker{

	

	public Developer(String name) {
		super(name);

	}

	@Override
	public double pay(int days) {
		Random random = new Random();
		return ( random.nextInt(90) + 10)*days;
		
	}

}
