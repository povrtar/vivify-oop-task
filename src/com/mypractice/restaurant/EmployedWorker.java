package com.mypractice.restaurant;

public abstract class EmployedWorker extends Radnik{
private Employer employer;
private Proffesion proffesion;
public  int pay;
public boolean busy;
public abstract double pay(int days);
public EmployedWorker(String name) {
	super(name);
	
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

}
