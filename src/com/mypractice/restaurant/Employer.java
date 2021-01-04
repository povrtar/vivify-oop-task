package com.mypractice.restaurant;

import java.util.List;

public class Employer {
private String name;
private List<EmployedWorker> workers;
public Employer(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<EmployedWorker> getWorkers() {
	return workers;
}
public void setWorkers(List<EmployedWorker> workers) {
	this.workers = workers;
}
public void addWorker(EmployedWorker worker) {
	
	this.workers.add(worker);
}

}
