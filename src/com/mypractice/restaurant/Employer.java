package com.mypractice.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employer {
private String name;
private List<Worker> workers=new ArrayList<>();
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
public List<Worker> getWorkers() {
	return workers;
}
public void setWorkers(List<Worker> workers) {
	this.workers = workers;
}
public void addWorker(Worker worker) {
	
	this.workers.add(worker);
}
/**
 * 
 */
public void pay(LocalDate date) {
	for(Worker worker:workers) {
		int workingDays=30;
		int days=workingDays-AbsenceService.getHolidayDays(worker, date);
		System.out.println("days for pay "+days);
		worker.pay(days);
	}
}
@Override
public String toString() {
	return "Employer [name=" + name  + "]";
}

}
