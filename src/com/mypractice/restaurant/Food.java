package com.mypractice.restaurant;

import java.util.List;

public class Food extends Product {
private List<Add> adds;
protected Food(int id,String name, Double price) {
		super(id,name, price);

	}
public List<Add> getAdds() {
	return adds;
}
public void setAdds(List<Add> adds) {
	this.adds = adds;
}
@Override
public String toString() {
	return this.getClass().getSimpleName()+" "+this.getName()+" price..."+this.getPrice()+" adds=" + adds ;
}


}
