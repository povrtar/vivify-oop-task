package com.mypractice.restaurant;

import java.time.LocalDate;

public class Absence {
private LocalDate date;
private int days;
private EmployedWorker worker;
public Absence(LocalDate date, int days, EmployedWorker worker) {
	super();
	this.date = date;
	this.days = days;
	this.worker = worker;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public int getDays() {
	return days;
}
public void setDays(int days) {
	this.days = days;
}
public EmployedWorker getWorker() {
	return worker;
}
public void setWorker(EmployedWorker worker) {
	this.worker = worker;
}

}
