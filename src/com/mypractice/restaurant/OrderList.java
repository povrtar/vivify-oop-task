package com.mypractice.restaurant;

import java.io.Serializable;
import java.util.List;

public class OrderList implements Serializable {
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
@Override
public String toString() {
	return "OrderList [products=" + products + ", totalPrice=" + totalPrice + "]";
}

}
