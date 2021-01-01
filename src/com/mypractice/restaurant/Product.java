package com.mypractice.restaurant;

import java.io.Serializable;

public abstract class Product implements Serializable {
private String name;
private Double price;
public int id;


protected Product(int id,String name, Double price) {
	super();
	this.name = name;
	this.price = price;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	id = id;
}
@Override
public String toString() {
	return "Product "+this.getClass().getSimpleName()+"..."+ this.getName()+" ..."+this.getPrice();
}

}
