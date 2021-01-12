package com.mypractice.restaurant;

import java.util.Random;

public class Student extends Worker {


	public Student(String name) {
		super(name);
		
	}


	@Override
	public double pay(int days) {
		Random random = new Random();
		double pay=(random.nextInt(4) + 3)*days;
		System.out.println("Student payed "+pay);
		return pay;

	}

}
