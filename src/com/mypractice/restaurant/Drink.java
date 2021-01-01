package com.mypractice.restaurant;

public class Drink extends Product{
private int volume;
protected Drink(int id,String name, Double price) {
		super(id,name, price);
	}
public Drink(int id,String name, Double price, int volume) {
	super(id,name, price);
	this.volume = volume;
}
public int getVolume() {
	return volume;
}
public void setVolume(int volume) {
	this.volume = volume;
}



}
