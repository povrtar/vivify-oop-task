package com.mypractice.restaurant;

public  class EmployedWorker extends Radnik{

private boolean onHoliday;
private Employer employer;
private double payable;
private Proffesion proffesion;
public  int pay;
public boolean busy;
public EmployedWorker(String name) {
	super(name);
	
}
public boolean isOnHoliday() {
	return onHoliday;
}

public void setOnHoliday(boolean onHoliday) {
	this.onHoliday = onHoliday;
}

public Employer getEmployer() {
	return employer;
}

public void setEmployer(Employer employer) {
	this.employer = employer;
}
public double getPayable() {
	return payable;
}
public void setPayable(double payable) {
	this.payable = payable;
}
public Proffesion getProffesion() {
	return proffesion;
}
public void setProffesion(Proffesion proffesion) {
	this.proffesion = proffesion;
}

public int getPay() {
	return pay;
}

public void setPay(int pay) {
	this.pay = pay;
}
public boolean isBusy() {
	return busy;
}
public void setBusy(boolean busy) {
	this.busy = busy;
}

}
