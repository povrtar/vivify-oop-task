package com.mypractice.restaurant;

public class EmployerFactory {
public Worker getEmployer(String employer,String name) {
	if(employer=="Student"){
			return new Student(name);
	}
	if (employer.equals("Doctor")) {
return new Doctor(name);
		
		
}
	if(employer.equals("Developer")) {
		return new Developer(name);
	}
	return null;
}
}