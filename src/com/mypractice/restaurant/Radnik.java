package com.mypractice.restaurant;

public abstract class Radnik {
private String name;
private String surname;
private Address address;

public Radnik(String name) {
	super();
	this.name = name;
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


}
