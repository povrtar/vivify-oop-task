package com.mypractice.restaurant;

import java.util.Random;

public class StudentServicer extends EmployedWorker {

	public StudentServicer(String string) {
		super.setName(string);
	}

	@Override
	public int payable() {
		Random random = new Random();

		int x = random.nextInt(4) + 3;
		return x;
	}

}
