package com.mypractice.restaurant;

import java.util.List;

public class OrderList {
private List<Product> products;
private double totalPrice;

public OrderList(List<Product> products) {
	super();
	this.products = products;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

}
