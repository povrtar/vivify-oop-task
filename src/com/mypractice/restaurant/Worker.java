package com.mypractice.restaurant;

import java.util.ArrayList;
import java.util.List;

public abstract class Worker {
	private String name;
	private String surname;
	private Address address;

private Employer employer;
private Proffesion proffesion;
private boolean busy;
private boolean onHoliday;
private List<Salary> salaries=new ArrayList<>();
public abstract double pay(int days);
public Worker(String name) {
	this.name=name;
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employer getEmployer() {
	return employer;
}

public void setEmployer(Employer employer) {
	this.employer = employer;
}

public Proffesion getProffesion() {
	return proffesion;
}
public void setProffesion(Proffesion proffesion) {
	this.proffesion = proffesion;
}

public boolean isBusy() {
	return busy;
}
public void setBusy(boolean busy) {
	this.busy = busy;
}

public boolean isOnHoliday() {
	return onHoliday;
}
public void setOnHoliday(boolean onHoliday) {
if(onHoliday) {
	System.out.println(this.name+" "+this.surname+" is on holiday!");
}else {
	System.out.println(this.name+" "+this.surname+" is back on work!");
}
	this.onHoliday = onHoliday;
}


public void addSalary(Salary salary) {
	this.salaries.add(salary);
}
@Override
public String toString() {
	return "EmployedWorker [employer=" + employer + ", proffesion=" + proffesion  + ", busy=" + busy
			+ "]";
}

}
