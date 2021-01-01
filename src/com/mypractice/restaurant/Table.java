package com.mypractice.restaurant;

public class Table {
private int id;
private OrderList orderList;
private boolean busy;
public Table(int id) {
	super();
	this.id = id;
	this.busy=false;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public OrderList getOrderList() {
	return orderList;
}
public void setOrderList(OrderList orderList) {
	this.orderList = orderList;
}
public Double getTotal() {
	Double sum=0.00;
	for(Product product:this.getOrderList().getProducts()) {
sum+=product.getPrice();
}
	return sum;
}
public boolean isBusy() {
	if(this.getOrderList()!=null) {
		this.setBusy(true);
	}
	return this.busy;
}
public void setBusy(boolean busy) {
	this.busy = busy;
}
@Override
public String toString() {
	return "Table [id=" + id + ", busy=" + busy + "]";
}

}
