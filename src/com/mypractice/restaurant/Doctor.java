package com.mypractice.restaurant;

import java.util.Random;

public class Doctor extends EmployedWorker {

	

	public Doctor(String name) {
		super(name);
		
	}

	@Override
	public void pay() {
		Random random = new Random();
		int x = random.nextInt(1600) + 400;
	
	}

}
