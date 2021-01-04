package com.mypractice.restaurant;

import java.util.Random;

public class StudentServicer extends EmployedWorker {


	public StudentServicer(String name) {
		super(name);
		
	}

	@Override
	public void pay() {
		Random random = new Random();

		int x = random.nextInt(4) + 3;

	}

}
