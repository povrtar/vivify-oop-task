package com.mypractice.restaurant;

import java.util.Random;

public class Developer extends EmployedWorker{

	public Developer(String string) {
		super.setName(string);
	}

	@Override
	public int payable() {
		Random random = new Random();
		int x = random.nextInt(90) + 10;
		return x;
	}

}
