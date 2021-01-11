package com.mypractice.restaurant;

import java.time.LocalDate;

public class Absence {
private LocalDate date;
private int days;
private Worker worker;
public Absence(LocalDate date, int days, Worker worker) {
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
public Worker getWorker() {
	return worker;
}
public void setWorker(Worker worker) {
	this.worker = worker;
}
@Override
public String toString() {
	return "Absence [date=" + date + ", days=" + days + ", worker=" + worker.toString() + "]";
}

}
