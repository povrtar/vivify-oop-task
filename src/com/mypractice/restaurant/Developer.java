package com.mypractice.restaurant;

import java.util.Random;

public class Developer extends EmployedWorker{

	

	public Developer(String name) {
		super(name);

	}

	@Override
	public void pay() {
		Random random = new Random();
		int x =( random.nextInt(90) + 10);
		
	}

}
