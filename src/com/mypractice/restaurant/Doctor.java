package com.mypractice.restaurant;

import java.util.Random;

public class Doctor extends EmployedWorker {

	public Doctor(String string) {
		super.setName(string);
	}

	@Override
	public int payable() {
		Random random = new Random();
		int x = random.nextInt(1600) + 400;
		return x;
	}

}
